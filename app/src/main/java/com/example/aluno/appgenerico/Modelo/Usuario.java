package com.example.aluno.appgenerico.Modelo;

import com.google.common.collect.Interner;
import com.orm.SugarRecord;

/**
 * Created by Aluno on 26/10/2017.
 */

public class Usuario extends SugarRecord {

    private String nome;
    private String email;
    private String login;
    private String senha;

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
