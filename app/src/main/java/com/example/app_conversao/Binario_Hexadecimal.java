package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Binario_Hexadecimal extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario__hexadecimal);

        editText = findViewById(R.id.editTextBin_Hex);
        textView = findViewById(R.id.resultBin_Hex);
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

        int bin, dec = 0, potencia = 7, resto;

        for(int i = 0; i < 8; i++) {

            bin = Integer.parseInt(Character.toString(n.charAt(i)));
            dec += (bin * Math.pow(2, potencia));
            potencia --;

        }

        String result = "";

        while(dec != 0) {

            resto = dec%16;

            switch (resto) {


                case 10:
                    result += "A";
                    break;

                case 11:
                    result += "B";
                    break;

                case 12:
                    result += "C";
                    break;

                case 13:
                    result+= "D";
                    break;

                case 14:
                    result += "E";
                    break;

                case 15:
                    result += "F";
                    break;

                default:
                    result += resto;
                    break;
            }

            dec = dec/16;
        }

        char[] vetorChar = result.toCharArray();

        int j = result.length() - 1;

        result = "";

        for(int i = j; i >= 0; i--) {

            result += Character.toString(vetorChar[i]);

        }

        textView.setText(result);

    }
}
