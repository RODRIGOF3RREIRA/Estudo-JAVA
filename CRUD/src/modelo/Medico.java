package modelo;

/**
 *
 * @author rodri
 * Usando herança de pessoa
 */
public class Medico extends Pessoa {
    
     public Medico(String nome, String email, String telefone){
            super.setNome(nome);
            super.setEmail(email);
            super.setTelefone(telefone);
     }
}
