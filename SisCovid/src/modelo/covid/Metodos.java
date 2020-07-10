package modelo.covid;

import java.util.Scanner;

public class Metodos {

    Scanner leitor = new Scanner(System.in, "ISO-8859-1");

    public void cadastro_nome() {
        System.out.println("----Cadastro de paciente----");
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
    }

    public void cadastro_CPF() {
        System.out.println("Digite seu CPF:");
        String CPF = leitor.nextLine();
    }

    public void cadastro_numero() {
        System.out.println("Digite seu numero:");
        String numero = leitor.nextLine();
    }

    public void cadastro_finalizado() {
        System.out.println("Cadastro finalizado");
        System.out.println("Pressione Entre para continuar!");

    }

    public void agendamento_consulta() {
        System.out.println("Horários disponíveis consulta on-line");
        System.out.println("Digite [1] para 8:00");
        System.out.println("Digite [2] para 15:00");
        int agendamento = leitor.nextInt();

        switch (agendamento) {

            case 1:
                System.out.println("Sua consulta será realizada as 8:00 da manhã");
                break;
            case 2:
                System.out.println("Sua consulta será realizada as 15:00 da tarde");
                break;
            default:
                System.out.println("Código invalido");
                
               
        }
    }

    public void fixa_medico() {
        System.out.println("Fixa do médico(a) que ira atendê-lo");
        System.out.println("Nome: Dr.Estranho");
        System.out.println("Sexo:Masculino");
        System.out.println("Idade:50");
    }

}
