package com.example.aluno.appgenerico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluno.appgenerico.Modelo.Usuario;

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
        login = (EditText) findViewById(R.id.editUsuario);
        senha = (EditText) findViewById(R.id.editSenha);
        cadastrar = (Button) findViewById(R.id.btnCadastrar);
        repetirsenha = (EditText) findViewById(R.id.editRpSenha);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nome.getText().toString().equals("")){
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo nome!", Toast.LENGTH_SHORT).show();

                } else if(email.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo email!", Toast.LENGTH_SHORT).show();

                } else if(login.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo usuário!", Toast.LENGTH_SHORT).show();

                } else if(senha.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo senha!", Toast.LENGTH_SHORT).show();

                } else if(repetirsenha.getText().toString().equals("")) {
                    Toast.makeText(TelaCadastrarActivity.this, "Preencha o campo repetir senha!", Toast.LENGTH_SHORT).show();

                } else if(senha.getText().toString().equals(repetirsenha.getText().toString())){
                    Usuario usuario = new Usuario();
                    usuario.setNome(nome.getText().toString());
                    usuario.setEmail(email.getText().toString());
                    usuario.setLogin(login.getText().toString());
                    usuario.setSenha(senha.getText().toString());
                    usuario.save();

                    Toast.makeText(TelaCadastrarActivity.this, "Foi cadastrado!", Toast.LENGTH_SHORT).show();
                    nome.setText("");
                    email.setText("");
                    login.setText("");
                    senha.setText("");
                }
            }
        });
    }
}
