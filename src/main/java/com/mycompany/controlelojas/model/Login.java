/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.model;

/**
 *
 * @author blackout
 */
public class Login {
    private int id;
    private String nome;
    private String senha;
    private String cpf;

    public Login(int id, String nome, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public Login(String nome, String cpf, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}

