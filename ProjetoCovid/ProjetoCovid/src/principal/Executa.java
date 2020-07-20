package principal;

import modelo.Consulta;
import modelo.Exame;
import modelo.Medico;
import modelo.Paciente;
import modelo.Pessoa;


public class Executa {
  public static void main(String[] args){
     Exame exame = new Exame();
     exame.setNome("Covid-19 Test");
     
     Paciente paciente = new Paciente("Junior", "a@a.com", "123123");
     paciente.setCodigo(1);
     paciente.setExame(exame);
     
     Medico medico = new Medico();
     medico.setNome("Dr. JJ");
     Consulta consulta = new Consulta(paciente, medico);
     // consulta.setPaciente(paciente);
     
     System.out.println("Covid Projeto");
     System.out.println("Nome " 
             + consulta.getPaciente().getNome());
     System.out.println("Exame realizado: ");
     System.out.println("==================");
     System.out.println(consulta.getPaciente().getExame().getNome());
     System.out.println("Médico Responsável "
            + consulta.getMedico().getNome());
    
     
    
  }  
}
