package com.devtechdmr.agromaltaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button buttonVisualizarPedidos, buttonSaidaBanana, buttonFazerPedidos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            buttonVisualizarPedidos = findViewById(R.id.buttonFazerPedido);
            buttonSaidaBanana = findViewById(R.id.buttonSaidaBanana);
            buttonFazerPedidos = findViewById(R.id.buttonFazerPedido);

            buttonSaidaBanana.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(),SaidaActivity.class);
                    startActivity(intent);

                }
            });

            buttonFazerPedidos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), PedidosActivity.class);
                    startActivity(intent);
                }
            });

    }

}
