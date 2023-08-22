public class Bola {
    private String nomeDaMarca;

    public Bola(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    public void quicar() {
        System.out.println("A bola está quicando.");
    }
}
