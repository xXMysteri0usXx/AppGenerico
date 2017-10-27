package com.example.aluno.appgenerico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastrarActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText login;
    private EditText senha;
    private EditText repetirsenha;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrar);

        nome = (EditText) findViewById(R.id.editNome);
        email = (EditText) findViewById(R.id.editEmail);
        login = (EditText) findViewById(R.id.editLogin);
        senha = (EditText) findViewById(R.id.editSenha);
        cadastrar = (Button) findViewById(R.id.btnCadastrar);
        repetirsenha = (EditText) findViewById(R.id.editRpSenha);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nome.getText().toString().equals("")){
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo nome!", Toast.LENGTH_SHORT).show();
                    return;
                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();
                    return;
                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();
                    return;
                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();
                    return;
                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();
                    return;
                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });


        // verificar todos
    }
}
