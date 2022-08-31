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
    private double quantidade;

    public Estoque(int id, String produto, double quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public Estoque(String produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
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
