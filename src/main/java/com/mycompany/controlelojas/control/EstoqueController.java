/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlelojas.control;

import com.mycompany.controlelojas.dao.EstoqueDao;
import com.mycompany.controlelojas.model.Estoque;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class EstoqueController {
    
        public void cadastrarProduto(String produto, double quantidade) {
        try {
            Estoque cproduto = new Estoque(produto, quantidade);
            EstoqueDao dao = new EstoqueDao();
            
            dao.save(cproduto);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
