package com.devtechdmr.agromaltaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;


public class PedidosActivity extends AppCompatActivity{

    private String[] clientes = new String[]{"TONATO", "SAÚDE", "GERAÇÃO 1", "GERAÇÃO 2", "GERAÇÃO 3", " M J ", " GOPIUVA"};
    private EditText qtdNanica, precoNanica, qtdPrata, precoPrata, qtdTerra, precoTerra, qtdMaca, precoMaca;
    private TextView textTotal, totalNanica, totalPrata, totalTerra, totalMaca;
    private Button buttonSalvarP;
    private int resulNanica, resulPrata, resulTerra, resulMaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, clientes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner listinha = findViewById(R.id.spinner);
        listinha.setAdapter(adapter);


        qtdNanica = findViewById(R.id.qtdNanica);
        qtdPrata = findViewById(R.id.qtdPrata);
        qtdTerra = findViewById(R.id.qtdTerra);
        qtdMaca = findViewById(R.id.qtdMaca);
        precoNanica = findViewById(R.id.precoNanica);
        precoPrata = findViewById(R.id.precoPrata);
        precoTerra = findViewById(R.id.precoTerra);
        precoMaca = findViewById(R.id.precoMaca);
        totalNanica = findViewById(R.id.totalNanica);
        totalPrata = findViewById(R.id.totalPrata);
        totalTerra = findViewById(R.id.totalTerra);
        totalMaca = findViewById(R.id.totalMaca);
        textTotal  = findViewById(R.id.textTotalBananas);
        buttonSalvarP = findViewById(R.id.buttonSalvarPedidos);



        precoNanica.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus && precoNanica.getText().toString() != null){
                    String tempNanicaqtd = qtdNanica.getText().toString();
                    int qtdNanicaI = 0;
                    qtdNanicaI = Integer.parseInt(tempNanicaqtd);
                    String  tempNanicaprec = precoNanica.getText( ).toString( );
                    int precoNanicaI = 0 ;
                    precoNanicaI = Integer.parseInt( tempNanicaprec );
                    resulNanica = qtdNanicaI * precoNanicaI;
                    totalNanica.setText(String.valueOf("R$"+resulNanica));
                    Toast.makeText(getApplicationContext(),"TOTAL NANICA "+totalNanica.getText().toString(), Toast.LENGTH_LONG).show();
                    textTotal.setText(String.valueOf("R$"+resulNanica));
                }
                else {
                    Toast.makeText(getApplicationContext(),"Faltou o Preço da Nanica", Toast.LENGTH_LONG).show();
                }
                }
        });

        precoPrata.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus && precoPrata.getText().toString() != null){
                    String tempPrataqtd = qtdPrata.getText().toString();
                    int qtdPrataI = 0;
                    qtdPrataI = Integer.parseInt(tempPrataqtd);
                    String  tempPrataprec = precoPrata.getText( ).toString( );
                    int precoPrataI = 0 ;
                    precoPrataI = Integer.parseInt( tempPrataprec );
                    resulPrata = qtdPrataI * precoPrataI;
                    totalPrata.setText(String.valueOf("R$"+resulPrata));
                    Toast.makeText(getApplicationContext(),"TOTAL PRATA "+totalPrata.getText().toString(), Toast.LENGTH_SHORT).show();
                    int temporario = resulPrata + resulNanica;
                    textTotal.setText(String.valueOf("R$"+temporario));
                }
            }
        });

        precoTerra.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus && precoTerra.getText().toString() !=null){
                    String tempTerraqtd = qtdTerra.getText().toString();
                    int qtdTerraI = 0;
                    qtdTerraI = Integer.parseInt(tempTerraqtd);
                    String tempTerraprec = precoTerra.getText().toString();
                    int precoTerraI = 0;
                    precoTerraI = Integer.parseInt(tempTerraprec);
                    resulTerra = qtdTerraI * precoTerraI;
                    totalTerra.setText(String.valueOf("R$"+resulTerra));
                    Toast.makeText(getApplicationContext(),"TOTAL TERRA "+totalTerra.getText().toString(), Toast.LENGTH_SHORT).show();
                    int temporario = resulPrata + resulNanica + resulTerra;
                    textTotal.setText(String.valueOf("R$"+temporario));


                }
            }
        });

        precoMaca.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus && precoMaca.getText().toString() !=null){
                    String tempMacaqtd = qtdMaca.getText().toString();
                    int qtdMacaI = 0;
                    qtdMacaI = Integer.parseInt(tempMacaqtd);
                    String tempMacaprec = precoMaca.getText().toString();
                    int precoMacaI = 0;
                    precoMacaI = Integer.parseInt(tempMacaprec);
                    resulMaca = qtdMacaI * precoMacaI;
                    totalMaca.setText(String.valueOf("R$"+resulMaca));
                    Toast.makeText(getApplicationContext(),"TOTAL Maça "+totalMaca.getText().toString(), Toast.LENGTH_SHORT).show();
                    int temporario = resulPrata + resulNanica + resulTerra + resulMaca;
                    textTotal.setText(String.valueOf("R$"+temporario + "" );
                }
            }
        });
        // int pNI = Integer.parseInt(pNS);

        // int resulNanicaI = numQtdNanicaI * numNanicaI;
        /*  buttonSalvarP.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  String tempNanicaqtd = qtdNanica.getText().toString();
                  int qtdNanicaI = 0;
                  qtdNanicaI = Integer.parseInt(tempNanicaqtd);

                  String  tempNanicaprec = precoNanica. getText ( ) . toString ( ) ;
                  int precoNanicaI = 0 ;
                  precoNanicaI = Integer . parseInt ( tempNanicaprec );

                  resulNanica = qtdNanicaI * precoNanicaI;
                  totalNanica.setText(String.valueOf("R$"+resulNanica));

                  Toast.makeText(this, " Pedido Cadastrado"+clientes, Toast.LENGTH_SHORT).show;
              }
          }); */




    }
}


