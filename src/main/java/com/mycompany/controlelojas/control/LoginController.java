/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.control;

import com.mycompany.controlelojas.dao.LoginDao;
import com.mycompany.controlelojas.model.Login;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class LoginController {
    
    
    public void validarLoginController(String nome,String cpf, String senha) throws SQLException{
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(senha);
        LoginDao validar = new LoginDao();
        validar.validarLogin(nome, cpf, senha);
    }
    
    public void cadastrarUsuarioController(String nome,String cpf, String senha) throws SQLException{
        LoginDao cadastrar = new LoginDao();
        Login novoLogin1 = new Login(nome, cpf, senha);
        cadastrar.save(novoLogin1);
    }
}
