package modelo;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    
    //Construtor sobrecarregado
    public Consulta (Paciente paciente, Medico medico){
        this.paciente = paciente;
        this.medico = medico;
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
    
}
