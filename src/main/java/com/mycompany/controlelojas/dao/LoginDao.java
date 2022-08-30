 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.dao;

import com.mycompany.controlelojas.connection.DatabaseConnection;

import com.mycompany.controlelojas.model.Login;
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
public class LoginDao {
        public void save(Login login) throws SQLException {
        String sql = "INSERT INTO login (nome, cpf, senha) "
                + "VALUES (?, ?, SHA2(?, 256))";

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, login.getNome());
        pstm.setString(2, login.getCpf());
        pstm.setString(3, login.getSenha() + "SANTOS");

        pstm.execute();
    }
    
    public ResultSet validarLogin(String nome,String cpf, String senha) throws SQLException{
        String sql = "SELECT * from login where " + "nome = ? AND cpf = ? AND senha = SHA2(?, 256)";
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(senha);
        
        pstm.setString(1, nome);
        pstm.setString(2, cpf);
        pstm.setString(3, senha + "SANTOS");
        
        ResultSet resultado = pstm.executeQuery();
        
        return resultado;
                
    }
    public void delete(String cpf) throws SQLException{
        String sql = "DELETE from login where " + "cpf = ?";
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setString(1, cpf);
        
        pstm.executeUpdate();
     
        
        
    } 
    public List<Login> getLogins() throws SQLException{
    String sql = "SELECT * from login";

    List<Login> logins = new ArrayList<>();

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = con.prepareStatement(sql);
    ResultSet resultado = pstm.executeQuery();

    while(resultado.next()){

        Login login = new Login("", "", "");
        //Recuperar o id
        login.setId(resultado.getInt("idlogin"));
        //Recuperar o nome
        login.setNome(resultado.getString("nome"));
        //Recuperar a idade
        login.setCpf(resultado.getString("cpf"));
        //Recuperar a data de cadastrado


        logins.add(login);
        
        

    }
            return logins;

    }  
        
    public static void main(String[] args) throws SQLException{
        
//        LoginDao dao = new LoginDao();
        
//        Login novoLogin1 = new Login("testefinal1", "testefinal12", "testefinal123");
//        Login novoLogin2 = new Login("teste4", "teste4", "teste4");
//        
//        dao.save(novoLogin1);
//        dao.save(novoLogin2);
//        dao.delete("teste");
//
//        System.out.println(dao.validarLogin("teste", "teste")); ;
////        dao.getLogins();;
////        System.out.println(dao.getLogins.());
//        for(Login l : dao.getLogins()) {
//                System.out.println("ID:"+l.getId() +" Login: "+l.getNome() + " CPF:"+l.getCpf());
//        }
//        
//                
                
    }
    
        
    
}
