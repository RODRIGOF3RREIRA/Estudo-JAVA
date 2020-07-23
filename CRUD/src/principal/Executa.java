package principal;

import modelo.Agendamento;
import modelo.Consulta;
import modelo.Exame;
import modelo.Medico;
import modelo.Paciente;

public class Executa {

    public static void main(String[] args) {
        Agendamento agendamento = new Agendamento ("dia", "mes", "ano");
        
        Exame exame = new Exame();
       
        Medico medico = new Medico("nome", "area", "codigo");
       
        Paciente paciente = new Paciente("nome", "email", "telefone");
        paciente.setExame(exame);
        
        Consulta consulta = new Consulta(paciente, medico, agendamento);
        consulta.setPaciente(paciente);
        
       
        
    }
}
