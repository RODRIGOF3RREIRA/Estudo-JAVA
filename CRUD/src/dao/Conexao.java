package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexao {
    
 Connection conn;   
 
 
 public void conectar() {
     try {
         Class.forName("com.mysql.jbdc.Driver");
         
         String url = "jdbc:mysql://database-1.cc6iprshiwg0.sa-east-1.rds.amazonaws.com/fazfatec";
         String usuario = "admin";
         String senha = "admin123";
         
         conn = DriverManager.getConnection(url, usuario, senha);
     } catch (ClassNotFoundException ex) {
         
         ex.printStackTrace();
     } catch (SQLException e) {
         e.printStackTrace();
     }
             
             
    
}
 public Connection getConexao(){
     return conn;
 }
}
