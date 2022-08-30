package com.mycompany.controlelojas.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author allan
 */
public class DatabaseConnection {

    private static final String host = "jdbc:mysql://localhost/controleestoque";
    private static final String user = "root";
    private static final String password = "root";
//    private static final String password = "ifrn.cn";
    private static  Connection conexao = null;
    
    // Padrão Singleton
    private DatabaseConnection () {
        
    }
    
    public static Connection getConnection() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.
                    getConnection(host, user, password);
        }
        return conexao;
    }
    
}
