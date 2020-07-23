package modelo;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private Agendamento agendamento;
    
    //Construtor sobrecarregado
    public Consulta (Paciente paciente, Medico medico, Agendamento agendamento){
        this.paciente = paciente;
        this.medico = medico;
        this.agendamento = agendamento;
    }

    public Medico getMedico() {
        return medico;
    }
    
    public Paciente getPaciente(){
        return paciente; 
    }
    public void setPaciente (Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Agendamento getAgendamento() {
        return agendamento;
    }
    
    
    
}
