/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.model;

/**
 *
 * @author blackout
 */
public class Estoque {
    private int id;
    private String produto;
    private int idlojas;
   
    public Estoque(int id, String produto, int idlojas) {
        this.id = id;
        this.produto = produto;
        this.idlojas = idlojas;
    }

    public Estoque(String produto) {
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getIdlojas() {
        return idlojas;
    }

    public void setIdlojas(int idlojas) {
        this.idlojas = idlojas;
    }
    
    


    
    
    
}

