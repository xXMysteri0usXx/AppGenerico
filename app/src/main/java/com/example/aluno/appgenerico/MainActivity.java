package com.example.aluno.appgenerico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluno.appgenerico.Modelo.Usuario;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private TextView cadastrar;
    private TextView sobre;
    private EditText txtlogin;
    private EditText txtsenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtlogin = (EditText) findViewById(R.id.editLoginP);
        txtsenha= (EditText) findViewById(R.id.editSenhaP);

        List<Usuario> usarios = Usuario.listAll(Usuario.class);

        try {
            for (Usuario u: usarios){
                Toast.makeText(this, u.getNome(), Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e ){
            Toast.makeText(this, e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }

        login = (Button) findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    List<Usuario> u = Usuario.find(Usuario.class, "login = ? and senha = ?", txtlogin.getText().toString() , txtsenha.getText().toString());
                    if (u.size() > 0) {
                        Toast.makeText(MainActivity.this, "usuário encontrado", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Este usuário não existe!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e){
                    Toast.makeText(MainActivity.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();;
                }
            }
        });

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
