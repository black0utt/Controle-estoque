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
import javax.swing.JOptionPane;

/**
 *
 * @author blackout
 */
public class EstoqueDao {

    ResultSet rs;
    ArrayList<Estoque> lista = new ArrayList<>();

    public void save(Estoque estoque) throws SQLException {
        String sql = "INSERT INTO estoque (produto, quantidade, idlojas) "
                + "VALUES (?, ?, ?)";

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, estoque.getProduto());
        pstm.setDouble(2, estoque.getQuantidade());
        pstm.setString(3, "2");

        pstm.execute();
    }

    public ArrayList<Estoque> PesquisarFuncionario() throws SQLException {
        String sql = "select * from estoque";
        Connection con = DatabaseConnection.getConnection();

        try {

            PreparedStatement pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Estoque objestoque = new Estoque("");
                objestoque.setId(rs.getInt("idestoque"));
                objestoque.setProduto(rs.getString("produto"));
                objestoque.setQuantidade(rs.getInt("quantidade"));

                lista.add(objestoque);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EstoqueDao Pesquisar: " + erro);
        }

        return lista;
    }
    
    public ResultSet listarLoja() throws SQLException{
        String sql = "select * from lojas";
        Connection con = DatabaseConnection.getConnection();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EstoqueDao listar loja: " + erro);
            return null;
        }
    }

    public void alterarEstoque(Estoque objestoque) throws SQLException {
        String sql = "update estoque set produto = ?, quantidade = ? where idestoque = ?";
        Connection con = DatabaseConnection.getConnection();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objestoque.getProduto());
            pstm.setDouble(2, objestoque.getQuantidade());
            pstm.setInt(3, objestoque.getId());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EstoqueDao Alterar: " + erro);
        }

    }

    public void excluirEstoque(Estoque objestoEstoque) throws SQLException {
        String sql = "DELETE from estoque where " + "idestoque = ?";
        Connection con = DatabaseConnection.getConnection();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, objestoEstoque.getId());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EstoqueDao Excluir: " + erro);
        }

    }

    public List<Estoque> getEstoque() throws SQLException {
        String sql = "SELECT * from estoque";

        List<Estoque> estoque = new ArrayList<>();

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet resultado = pstm.executeQuery();

        while (resultado.next()) {

            Estoque estoques = new Estoque("");

            estoques.setId(resultado.getInt("idestoque"));

            estoques.setProduto(resultado.getString("produto"));

            estoques.setIdlojas(resultado.getInt("idlojas"));

            estoque.add(estoques);

        }
        return estoque;

    }

    public static void main(String[] args) throws SQLException {

        EstoqueDao dao = new EstoqueDao();

//        Estoque novoEstoque1 = new Estoque("peixe");
//        Estoque novoEstoque2 = new Estoque("agua");
//       
//        dao.save(novoEstoque1);
//        dao.save(novoEstoque2);

        for (Estoque e : dao.getEstoque()) {
            System.out.println("ID Estoque:" + e.getId() + " Produto: " + e.getProduto() + " Id Loja:" + e.getIdlojas());
        }

//                
    }

}
