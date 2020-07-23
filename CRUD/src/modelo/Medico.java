package modelo;

/**
 *
 * @author rodri
 * Usando herança de pessoa
 */
public class Medico extends Pessoa {
    
    
     public Medico(String nome, String area, String codigo){
            super.setNome(nome);
            super.setArea(area);
            super.setCodigo(codigo);
     }

 
}