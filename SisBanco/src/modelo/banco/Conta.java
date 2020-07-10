
package modelo.banco;

public class Conta {
     private double saldo;
    public void sacar(double valor){
        saldo -= valor;
}
    public void depositar (double valor){
        saldo += valor;
    }
    public void extrato(){
        System.out.println("Seu saldo:" + saldo);
    }
}
