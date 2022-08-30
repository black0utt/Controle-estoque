/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.dao;

import com.mycompany.controlelojas.connection.DatabaseConnection;

import com.mycompany.controlelojas.model.Lojas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blackout
 */
public class LojasDao {
        public void save(Lojas lojas) throws SQLException {
        String sql = "INSERT INTO lojas (endereco, cidade) "
                + "VALUES (?, ?)";

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, lojas.getEndereco());
        pstm.setString(2, lojas.getCidade());
   

        pstm.execute();
    }
    
    public void delete(String cidade) throws SQLException{
        String sql = "DELETE from lojas where " + "cidade = ?";
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setString(1, cidade);
        
        pstm.executeUpdate();
     
        
        
    } 
    public List<Lojas> getLojas() throws SQLException{
    String sql = "SELECT * from lojas";

    List<Lojas> lojas = new ArrayList<>();

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = con.prepareStatement(sql);
    ResultSet resultado = pstm.executeQuery();

    while(resultado.next()){

        Lojas loja = new Lojas("", "");
        //Recuperar o id
        loja.setId(resultado.getInt("idlojas"));
        //Recuperar o nome
        loja.setEndereco(resultado.getString("endereco"));
        //Recuperar a idade
        loja.setCidade(resultado.getString("cidade"));
        //Recuperar a data de cadastrado


        lojas.add(loja);
        
        

    }
        return lojas;

    }  
        
    public static void main(String[] args) throws SQLException{
        
        LojasDao dao = new LojasDao();
        
//        Lojas novaLoja1 = new Lojas("Rua do carmo", "Natal");
//        Lojas novaLoja2 = new Lojas("Rua da brita", "Currais Novos");
//        
//        dao.save(novaLoja1);
//        dao.save(novaLoja2);
        dao.delete("Natal");

        for(Lojas l : dao.getLojas()) {
                System.out.println("ID:"+l.getId() +" Endereço: "+l.getEndereco() + " Cidade:"+l.getCidade());
        }
        
//                
                
    }
    
        
    
}
