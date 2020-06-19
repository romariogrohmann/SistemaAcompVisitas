package com.romariogrohmann.sistemagestaodevisitas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class incluirvisitas extends AppCompatActivity {

    private Button btIncluirVisitas;
    private DatabaseReference bancoreferencia = FirebaseDatabase.getInstance().getReference().child("VISITAS");

    private TextView dadohora;
    private EditText dadodata;
    private EditText dadocliente;
    private EditText dadorua;
    private EditText dadonumero;
    private EditText dadocidade;
    private EditText dadouf;
    private EditText dadocontato;
    private Spinner dadotipo;
    private EditText dadoreceita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incluirvisitas);


        btIncluirVisitas = findViewById(R.id.btIncluirVisita);
        dadohora = findViewById(R.id.inputHora);
        dadodata = findViewById(R.id.inputData);
        dadocliente = findViewById(R.id.inputCliente);
        dadorua = findViewById(R.id.inputRua);
        dadonumero = findViewById(R.id.inputNumero);
        dadocidade = findViewById(R.id.inputCidade);
        dadouf = findViewById(R.id.inputUF);
        dadocontato = findViewById(R.id.inputContato);
        dadotipo = findViewById(R.id.spinner_tipo);
        dadoreceita = findViewById(R.id.inputResEsperado);

        btIncluirVisitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hora = dadohora.getText().toString();
                String data = dadodata.getText().toString();
                String cliente = dadocliente.getText().toString();
                String rua = dadorua.getText().toString();
                String numero = dadonumero.getText().toString();
                String cidade = dadocidade.getText().toString();
                String uf = dadouf.getText().toString();
                String contato = dadocontato.getText().toString();
                String tipo = dadotipo.getSelectedItem().toString();
                String receita = dadoreceita.getText().toString();

                //bancoreferencia.child("visita").push().setValue();
                // bancoreferencia.child("pontos").setValue(100);

                if (hora.equals("") ){
                    dadohora.setError("Preencher Campo");
                }else if (data.equals("")){
                    dadodata.setError("Preencher Campo");
                }else if (cliente.equals("")){
                    dadocliente.setError("Preencher Campo");
                }else if (rua.equals("")){
                    dadorua.setError("Preencher Campo");
                }else if (numero.equals("")){
                    dadonumero.setError("Preencher Campo");
                }else if (cidade.equals("")){
                    dadocidade.setError("Preencher Campo");
                }else if (uf.equals("")){
                    dadouf.setError("Preencher Campo");
                }else if (contato.equals("")){
                    dadocontato.setError("Preencher Campo");
                }else {
                    ArrayVisita arrayVisita;
                    arrayVisita=new ArrayVisita();
                    arrayVisita.setHora(hora);
                    arrayVisita.setData(data);
                    arrayVisita.setCliente(cliente);
                    arrayVisita.setRua(rua);
                    arrayVisita.setNumero(numero);
                    arrayVisita.setCidade(cidade);
                    arrayVisita.setUf(uf);
                    arrayVisita.setContato(contato);
                    arrayVisita.setTipo(tipo);
                    arrayVisita.setReceita(receita);
                    arrayVisita.setVendedor("");
                    arrayVisita.setResultado("");
                    arrayVisita.setRecGerada("");
                    arrayVisita.setLocalizacao("");
                    bancoreferencia.push().setValue(arrayVisita);
                    dialogocadastroOK();

                    dadohora.setText("");
                    dadodata.setText("");
                    dadocliente.setText("");
                    dadorua.setText("");
                    dadonumero.setText("");
                    dadocidade.setText("");
                    dadouf.setText("");
                    dadocontato.setText("");
                    dadotipo.setSelection(0);
                    dadoreceita.setText("");


                }

            }
        });

        }

    public void dialogocadastroOK() {
        okCadastro okcadastro = new okCadastro();
        okcadastro.show(getSupportFragmentManager(),"Cadastrado");

    }
}
