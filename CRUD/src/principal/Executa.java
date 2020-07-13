package principal;

import modelo.Consulta;
import modelo.Exame;
import modelo.Medico;
import modelo.Paciente;

public class Executa {

    public static void main(String[] args) {
        Exame exame = new Exame();
        exame.setNome("Covid-19");
      
        Medico medico = new Medico();
        medico.setNome("dr");

        Paciente paciente = new Paciente();
        //paciente.setNome("Junior");
        paciente.setExame(exame);
        Consulta consulta = new Consulta(paciente, medico);
        consulta.setPaciente(paciente);

        System.out.println("Nome: " +consulta.getPaciente() .getNome());
        System.out.println("Medico: "+consulta.getMedico() .getNome());
    }
}
