/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.model;

/**
 *
 * @author blackout
 */
public class Lojas {
    private int id;
    private String endereco;
    private String cidade;

    public Lojas(int id, String endereco, String cidade) {
        this.id = id;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Lojas(String endereco, String cidade) {
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

    
    
    
}

