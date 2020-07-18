package principal;

public class Executa {
    public static void main(String[] args) {
        
        Personagem p1 = new Personagem();
        p1.setVida(100);
        
        Personagem p2 = new Personagem();
        p2.setVida(100);
        Personagem.contadorplayer();
    }
}
