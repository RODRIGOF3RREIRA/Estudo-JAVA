package principal;


public class Personagem {
   private int vida;
    static int jogadores;
   
   public Personagem(){
       jogadores++;
   }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
   
    public static void contadorplayer () {
        System.out.println("Número Jogadores " + jogadores);
    }
   
}
