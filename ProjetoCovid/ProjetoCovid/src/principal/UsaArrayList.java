package principal;

import java.util.ArrayList;
import modelo.Paciente;

/**
 *
 * @author vinicius
 */
public class UsaArrayList {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Nome", "email", "telefone");
        Paciente p2 = new Paciente("Nome", "email", "telefone");
                
        ArrayList lista = new ArrayList();
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente.add(p1);
        listaPaciente.add(p2); //adiciona
        
        lista.get(0); //recupera
        lista.remove(0); // remove

    }
}
