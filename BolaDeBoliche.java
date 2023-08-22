public class BolaDeBoliche extends Bola {

    public BolaDeBoliche(String nomeDaMarca) {
        super (nomeDaMarca);  
    }

    public void lancar() {
        System.out.println("A bola de boliche foi lançada.");
    }

    public void quicar() {
        System.out.println("A bola de boliche não quica, ela rola.");
    }

    public static void main(String[] args) {
        BolaDeBoliche rhino = new BolaDeBoliche("Brunswick");
        rhino.lancar();
        rhino.quicar();
    }
}

