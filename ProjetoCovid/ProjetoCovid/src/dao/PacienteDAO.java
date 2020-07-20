package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Paciente;


public class PacienteDAO {
    Conexao conexao;
    String sqlSelectPaciente = "select * from PESSOA";
    PreparedStatement psSelectPessoa, psInsertPessoa, PsUpdatePessoa;
    public PacienteDAO(){
        try {
            //Conectar no banco
            conexao = new Conexao();
            conexao.conectar();
     psSelectPessoa = conexao.getConexao().prepareStatement(sqlSelectPaciente);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void incluir(Paciente paciente){
     try {
            String SQL = "insert into PESSOA(id_pessoa, nome, cpf , rg, data_nasc, endereco, telefone)"
                    + "values(?, ?, ? , ?, ? , ?, ?)";      
            PreparedStatement ps =  conexao.getConexao().prepareStatement(SQL);
            //Preenche a instrução SQL
            ps.setInt(1, 50);
            ps.setString(2, paciente.getNome());
            ps.setString(3, "123123");
            ps.setString(4, "123123");
            ps.setDate(5, new java.sql.Date(new Date().getTime()));
            ps.setString(6, "RUA X");
            ps.setString(7, "");
            //Realiza
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     
    
    }
    public void alterar(Paciente paciente){}
    
    public Paciente getPaciente(int codigo){
    return new Paciente("", "", "");
    }
    //Exclusão lógica
    public void desativar(Paciente paciente){}
    
    public ArrayList<Paciente> listarPaciente(){
       ArrayList<Paciente> lista = new ArrayList<>();
        try {
            ResultSet rs = psSelectPessoa.executeQuery();            
            Paciente paciente;
            while(rs.next()){
                // Pega os dados da linha na tabela
                int id = rs.getInt("id_pessoa");
                String nome = rs.getString("nome_pessoa");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                paciente = new Paciente(nome, email, telefone);
                paciente.setCodigo(id);
                
                lista.add(paciente);
                System.out.println("Nome " + nome);
                System.out.println("Tel " + telefone);
                System.out.println("----------------");
            }
            return lista;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return lista;
        }
    }
}

