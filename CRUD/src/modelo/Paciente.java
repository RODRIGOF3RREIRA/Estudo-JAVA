package modelo;

public class Paciente {
        private String nome;
        private Exame exame;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public Exame getExame ()  {
        return exame;
    }
       public void setExame (Exame exame) {
           this.exame = exame;
       }
}
