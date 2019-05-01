package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button buttonConfirmar;
    RadioButton rdBtnDecimal_Binario, rdBtnDecimal_Hexadecimal;
    RadioButton rdBtnBinario_Decimal, rdBtnBinario_Hexadecimal;
    RadioButton rdBtnHexadecimal_Binario, rdBtnHexadecimal_Decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConfirmar = findViewById(R.id.btnConfirmar);

        // Conversões do Decimal
        rdBtnDecimal_Binario = findViewById(R.id.rdBtnDecimal_Binario);
        rdBtnDecimal_Hexadecimal = findViewById(R.id.rdBtnDecimal_Hexadecimal);

        //Conversões Binário
        rdBtnBinario_Decimal = findViewById(R.id.rdBtnBinario_Decimal);
        rdBtnBinario_Hexadecimal = findViewById(R.id.rdBtnBinarioHexadecimal);

        //Conversões Hexadecimal
        rdBtnHexadecimal_Binario = findViewById(R.id.rdBtnHexadecimal_Binario);
        rdBtnHexadecimal_Decimal = findViewById(R.id.rdBtnHexadecimal_Decimal);

    }


    public void Confirmar(View view) {

      // Conversão Decimal
        if (rdBtnDecimal_Binario.isChecked()) {

            Intent intent = new Intent(this, Decimal_Binario.class);
            startActivity(intent);
            finish();
        }

        if (rdBtnDecimal_Hexadecimal.isChecked()) {

            Intent intent = new Intent(this, Decimal_Hexadecimal.class);
            startActivity(intent);
            finish();

        }

        // Conversão Binário

        if(rdBtnBinario_Hexadecimal.isChecked()){

            Intent intent = new Intent(this, Binario_Hexadecimal.class);
            startActivity(intent);
            finish();

        }

        if(rdBtnBinario_Decimal.isChecked()){

            Intent intent = new Intent(this, Binario_Decimal.class);
            startActivity(intent);
            finish();

        }

        //Conversões Hexadecimal

        if(rdBtnHexadecimal_Decimal.isChecked()){

            Intent intent = new Intent(this, Hexadecimal_Decimal.class);
            startActivity(intent);
            finish();

        }

        if(rdBtnHexadecimal_Binario.isChecked()){

            Intent intent = new Intent(this, Hexadecimal_Binario.class);
            startActivity(intent);
            finish();

        }


    }

}

