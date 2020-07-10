
package modelo.banco;

public class ContaSalario extends Conta {
    @Override
    public void depositar (double valor){
     }
    public void receberOrdemPagamento (double valor){
        super.depositar(valor);
    }
}
