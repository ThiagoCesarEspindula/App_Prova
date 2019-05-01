package com.example.app_conversao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hexadecimal_Decimal extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexadecimal__decimal);

        editText = findViewById(R.id.editTextHex_Dec);
        textView = findViewById(R.id.resultHex_Dec);
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

        String n = editText.getText().toString();

        int i = Integer.valueOf(n, 16).intValue();

        textView.setText(""+i);
    }
}
