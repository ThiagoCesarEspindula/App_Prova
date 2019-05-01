package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Decimal_Binario extends AppCompatActivity {


    EditText editText;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal__binario);


        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.resultTextView);


    }


    public void Converter(View view) {

        //Toast.makeText(getApplicationContext(), "Botão Apertado", Toast.LENGTH_SHORT).show();

        if(editText.getText().toString().isEmpty()){

            Toast.makeText(getApplicationContext(), "Digite um número", Toast.LENGTH_LONG).show();
            return;

        }

        int n, resto;

        String resul_bin = "";

       n = Integer.parseInt(editText.getText().toString());

        for(int i = 0; i < 8; i++) {

            resto = n%2;


            resul_bin += resto;

            n = n/2;


        }

        char [] p = resul_bin.toCharArray();

        resul_bin = "";

        for(int i = 7; i >= 0; i--) {

            resul_bin += Character.toString(p[i]);

        }


        textView.setText(resul_bin);


    }

    public void Voltar(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
