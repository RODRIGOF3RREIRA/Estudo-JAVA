package banco;

import modelo.banco.ContaCorrente;
import modelo.banco.ContaPoupanca;
import modelo.banco.ContaSalario;

public class Terminal {
    public static void main(String [] args){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1234);
        conta.extrato();
        
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(500);
        poupanca.extrato();
        
        ContaSalario contasalario = new ContaSalario();
        contasalario.depositar(1090);
        contasalario.extrato();
    }
}
 