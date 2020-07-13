package modelo;

public class Paciente extends Pessoa{
        private Exame exame;

        @Override
    public String getNome() {
        if (super.getNome() == null){
            return  "Paciente";
        }
        return super.getNome();
    }

    
     
    public Exame getExame ()  {
        return exame;
    }
       public void setExame (Exame exame) {
           this.exame = exame;
       }
}
