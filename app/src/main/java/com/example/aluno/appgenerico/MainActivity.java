package com.example.aluno.appgenerico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private TextView cadastrar;
    private TextView sobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastrar = (TextView) findViewById(R.id.textCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity( new Intent(
                        MainActivity.this,
                        TelaCadastrarActivity.class
                ) );

            }
        });
        sobre = (TextView) findViewById(R.id.textSobre);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(
                        MainActivity.this,
                        TelaSobreActivity.class
                ) );

            }
        });
    }
}
