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
         
         String url = "jbdc:mysql://https://databases-auth.000webhost.com/db_structure.php?server=1&db=id14379488_crudprova";
         String usuario = "id14379488_cruduser";
         String senha = "Wk80LPA~Y$d1*pW~";
         
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
