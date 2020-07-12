package principal;

import modelo.Consulta;
import modelo.Exame;
import modelo.Paciente;

public class Executa {
    public static void main (String[ ] args){
        Exame exame = new Exame();
        exame.setNome("Covid-19");
        
        
        
        
        Paciente paciente = new Paciente ();
        paciente.setNome("Junior");
        paciente.setExame(exame);
        Consulta consulta = new Consulta ();
        consulta.setPaciente(paciente);
        
        
    }
}
