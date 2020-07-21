package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexao {
    
 Connection conn;   
 
 
 public void conectar() {
     try {
         Class.forName("com.mysql.cj.jbdc.Driver");
         
         String url = "jdbc:mysql://databases.000webhost.com/sql.php?db=id14033772_covid&table=paciente&pos=0";
         String usuario = "id14033772_joaojesus";
         String senha = "Winchester.22";
         
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
