package principal;

import modelo.Consulta;
import modelo.Exame;
import modelo.Medico;
import modelo.Paciente;

public class Executa {

    public static void main(String[] args) {
        Exame exame = new Exame();
       
        Medico medico = new Medico("nome", "email", "telefone");
       
        Paciente paciente = new Paciente("nome", "email", "telefone");
        paciente.setExame(exame);
        
        Consulta consulta = new Consulta(paciente, medico);
        consulta.setPaciente(paciente);

 
    }
}
