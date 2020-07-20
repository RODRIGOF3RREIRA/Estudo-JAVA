package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexao {
    
    Connection conn;
    
   public void conectar(){
        try {
            //Carregar o driver do banco mysql NA VERSÃO 5
            Class.forName("com.mysql.jdbc.Driver");
            // Para versão mais novas mudou ... com.mysql.cj.jdbc.Driver
            
            // Tenta conectar via jdbc
            String url = "jdbc:mysql://database-1.cc6iprshiwg0.sa-east-1.rds.amazonaws.com/fazfatec";
            String usuario = "admin";
            String senha = "admin123";
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException ex) {
            // Deu zebra Não achou a classe
            ex.printStackTrace();
        } catch (SQLException e) {
             e.printStackTrace();
        }
   }
   public Connection getConexao(){
       return conn;
   }
}