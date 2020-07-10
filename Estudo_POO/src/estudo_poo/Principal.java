package estudo_poo;

public class Principal {

  
    public static void main(String[] args) {
        
        Cadeira c1 = new Cadeira();
      c1.serrar();
      c1.lixar();
      c1.pintar();
    System.out.println("Cor: "+c1.getCor());
    }
}
