package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Binario_Decimal extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario__decimal);

        editText = findViewById(R.id.editTextBin_Dec);
        textView = findViewById(R.id.resultBin_Dec);

    }

    public void Voltar(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void Converter(View view) {

        if(editText.getText().toString().isEmpty()){

            Toast.makeText(getApplicationContext(), "Digite um número", Toast.LENGTH_LONG).show();
            return;

        }

        if(editText.getText().length() > 8 || editText.getText().length() < 8){

            Toast.makeText(getApplicationContext(), "Digite os oito bits", Toast.LENGTH_LONG).show();
            return;
        }

       String n = editText.getText().toString();

        int bin, result = 0, potencia = 7;

        for(int i = 0; i < 8; i++) {

            bin = Integer.parseInt(Character.toString(n.charAt(i)));
            result += (bin * Math.pow(2, potencia));
            potencia --;

        }

        textView.setText(""+result);

    }
}
