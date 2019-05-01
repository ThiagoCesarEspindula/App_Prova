package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Decimal_Hexadecimal extends AppCompatActivity {


    EditText editText;
    TextView textView;
    Button buttonConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal__hexadecimal);


        editText = findViewById(R.id.editTextDecimalHex);
        textView = findViewById(R.id.resultDecHex);
        buttonConverter = findViewById(R.id.buttonConvertDecHex);

    }

    public void Converter(View view) {

        int n, resto;

        if(editText.getText().toString().isEmpty()){

            Toast.makeText(getApplicationContext(), "Digite um número", Toast.LENGTH_LONG).show();
            return;

        }

        n = Integer.parseInt(editText.getText().toString());

        String result = "";

        while(n != 0) {

            resto = n%16;

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

            n = n/16;
        }

        char[] vetorChar = result.toCharArray();

        int j = result.length() - 1;

        result = "";

        for(int i = j; i >= 0; i--) {

            result += Character.toString(vetorChar[i]);

        }


        textView.setText(result);


    }

    public void Voltar(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
