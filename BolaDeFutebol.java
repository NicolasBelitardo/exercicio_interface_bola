public class BolaDeFutebol extends Bola {
    public BolaDeFutebol (String nomeDaMarca) {
        super (nomeDaMarca);        
    }

    public void lancar() {
        System.out.println("A bola foi lançada.");
    }

    public void quicar() {
        System.out.println("A bola está quicando.");
    }

    public static void main(String[] args) {
        BolaDeFutebol oceaunz = new BolaDeFutebol("Adidas");
        oceaunz.lancar();
        oceaunz.quicar();
    }
}

