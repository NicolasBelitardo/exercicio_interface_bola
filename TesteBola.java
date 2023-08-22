public class TesteBola {
    public static void main(String args[]) {

        Pedra pedregulho = new Pedra();
        pedregulho. lancar();
        
        BolaDeBoliche rhino = new BolaDeBoliche ( "Brunswick");
        rhino. lancar();
        rhino.quicar();
     
        BolaDeFutebol oceaunz = new BolaDeFutebol ( "Adidas");
        oceaunz.lancar();
        oceaunz.quicar();
    }
}