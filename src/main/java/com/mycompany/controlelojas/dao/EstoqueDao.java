/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.dao;

import com.mycompany.controlelojas.connection.DatabaseConnection;

import com.mycompany.controlelojas.model.Estoque;
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
public class EstoqueDao {
        public void save(Estoque estoque) throws SQLException {
        String sql = "INSERT INTO estoque (produto) "
                + "VALUES (?)";

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, estoque.getProduto());

   

        pstm.execute();
    }
    
    public void delete(int id) throws SQLException{
        String sql = "DELETE from estoque where " + "idestoque = ?";
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setInt(1, id);
        
        pstm.executeUpdate();
     
        
        
    } 
    public List<Estoque> getEstoque() throws SQLException{
    String sql = "SELECT * from estoque";

    List<Estoque> estoque = new ArrayList<>();

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = con.prepareStatement(sql);
    ResultSet resultado = pstm.executeQuery();

    while(resultado.next()){

        Estoque estoques = new Estoque("");

        estoques.setId(resultado.getInt("idestoque"));

        estoques.setProduto(resultado.getString("produto"));

        estoques.setIdlojas(resultado.getInt("idlojas"));



        estoque.add(estoques);
        
        

    }
        return estoque;

    }  
        
    public static void main(String[] args) throws SQLException{
        
        EstoqueDao dao = new EstoqueDao();
        
//        Estoque novoEstoque1 = new Estoque("peixe");
//        Estoque novoEstoque2 = new Estoque("agua");
//       
//        dao.save(novoEstoque1);
//        dao.save(novoEstoque2);
        dao.delete(1);

        for(Estoque e : dao.getEstoque()) {
                System.out.println("ID Estoque:"+e.getId() +" Produto: "+e.getProduto() + " Id Loja:"+e.getIdlojas());
        }
        
//                
                
    }
    
        
    
}
