
package estudo_poo;

public class Cadeira {
    private double altura;
    private double altura_assento;
    private String  cor;
    
    public Cadeira(){
        cor = "Marrom";
        altura =  1.00;
        altura_assento = 1.42;
    }
    
    
     public void serrar (){
        System.out.println("Serrando a madeira...");
    }
    
   public  void lixar (){
        System.out.println("Lixando a cadeira");
    }
    
    public void pintar (){
        System.out.println("Pintando a madeira");
    }
    
 public String getCor (){
     return cor;
        } 
}

