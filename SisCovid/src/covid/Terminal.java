package covid;

import java.util.Scanner;
import modelo.covid.Atendente;
import modelo.covid.Medico;
import modelo.covid.Paciente;

public class Terminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medico medico = new Medico();
        Atendente atendente = new Atendente();
        Paciente paciente = new Paciente();
        

        /**********<CADASTRO>*********/
        paciente.cadastro_nome();
        paciente.cadastro_CPF();
        paciente.cadastro_numero();
        atendente.cadastro_finalizado();
        scanner.nextLine();
        atendente.cls();
       
        /**********</CADASTRO>*******/
        
        /*****<AGENDAMENTO>*******/
        paciente.agendamento_consulta();
        System.out.println("Pressione Entre para continuar!");
       
        /********</AGENDAMENTO>****/
        scanner.nextLine();
        medico.fixa_medico();

    }

}
