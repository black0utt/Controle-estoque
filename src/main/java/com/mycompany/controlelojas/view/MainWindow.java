/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.controlelojas.view;

import com.mycompany.controlelojas.control.EstoqueController;
import com.mycompany.controlelojas.dao.EstoqueDao;
import com.mycompany.controlelojas.model.Estoque;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarValoresEstoque();
        restaurarDadosComboBoxCargo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        btnCadastrarProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnCarregarCampos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxLoja = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Produto", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(tabelaEstoque);

        jLabel1.setText("Nome do produto");

        jLabel2.setText("Quantidade");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoActionPerformed(evt);
            }
        });

        btnCadastrarProduto.setBackground(new java.awt.Color(0, 204, 51));
        btnCadastrarProduto.setText("Salvar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Código");

        txtCodigo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCodigo.setEnabled(false);

        btnCarregarCampos.setText("Carregar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(102, 204, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Loja");

        cbxLoja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCarregarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarProduto)
                        .addGap(5, 5, 5)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnCarregarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        CadastrarEstoque();
        listarValoresEstoque();
        LimparCampos();

    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if ("".equals(txtNomeProduto.getText()) || "".equals(txtQuantidadeProduto.getText())) {
                JOptionPane.showMessageDialog(null, "Carregue os campos");
            } else {
                AlterarEstoque();
                listarValoresEstoque();
                LimparCampos();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if ("".equals(txtNomeProduto.getText()) || "".equals(txtQuantidadeProduto.getText())) {
                JOptionPane.showMessageDialog(null, "Carregue os campos");
            } else {
                ExcluirEstoque();
                listarValoresEstoque();
                LimparCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbxLoja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables

    private void listarValoresEstoque() {
        try {
            EstoqueDao objestoqueDao = new EstoqueDao();

            DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
            model.setNumRows(0);

            ArrayList<Estoque> lista = objestoqueDao.PesquisarFuncionario();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getProduto(),
                    lista.get(num).getQuantidade(),
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar valores view: " + erro);
        }
    }

    private void CarregarCampos() {
        int setar = tabelaEstoque.getSelectedRow();

        txtCodigo.setText(tabelaEstoque.getModel().getValueAt(setar, 0).toString());
        txtNomeProduto.setText(tabelaEstoque.getModel().getValueAt(setar, 1).toString());
        txtQuantidadeProduto.setText(tabelaEstoque.getModel().getValueAt(setar, 2).toString());
    }

    private void CadastrarEstoque() {
        String validarpreco = this.txtQuantidadeProduto.getText();
        boolean isNumeric = validarpreco.matches("[+-]?\\d*(\\.\\d+)?");
        //...
        if (!isNumeric) {
            this.txtQuantidadeProduto.setText("");
            JOptionPane.showMessageDialog(null, "A quantidade não pode conter letras.");
        } else {
            String produto = this.txtNomeProduto.getText();
            Double preco = Double.parseDouble(this.txtQuantidadeProduto.getText());
            EstoqueController controle = new EstoqueController();
            controle.cadastrarProduto(produto, preco);
        }
    }

    private void LimparCampos() {
        txtCodigo.setText("");
        txtNomeProduto.setText("");
        txtQuantidadeProduto.setText("");
        txtNomeProduto.requestFocus();
    }

    private void AlterarEstoque() throws SQLException {
        int idestoque;
        String produto;
        Double quantidade;

        idestoque = Integer.parseInt(txtCodigo.getText());
        produto = txtNomeProduto.getText();
        quantidade = Double.parseDouble(txtQuantidadeProduto.getText());

        Estoque objestoque = new Estoque("");
        objestoque.setId(idestoque);
        objestoque.setProduto(produto);
        objestoque.setQuantidade(quantidade);

        EstoqueDao objestoquedao = new EstoqueDao();
        objestoquedao.alterarEstoque(objestoque);
    }

    private void ExcluirEstoque() throws SQLException {
        int idestoque;

        idestoque = Integer.parseInt(txtCodigo.getText());

        Estoque objestoque = new Estoque("");
        objestoque.setId(idestoque);

        EstoqueDao objestoquedao = new EstoqueDao();
        objestoquedao.excluirEstoque(objestoque);
    }
    
    Vector<Integer> idlojas = new Vector<Integer>();
            
    public void restaurarDadosComboBoxCargo(){
        
        try {
            EstoqueDao objfuncionariodao = new EstoqueDao();
            ResultSet rs = objfuncionariodao.listarLoja();
            
            while (rs.next()){
                idlojas.addElement(rs.getInt(1));
                cbxLoja.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Recuperar dados view: " + erro);
        }
        
    }
}
