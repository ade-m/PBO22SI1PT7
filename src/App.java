import model.Engine;
import model.Mobil;
public class App {
    public static void main(String[] args) throws Exception {
        //dependency
        Mobil mobil = new Mobil();
        mobil.start();
        mobil.stop();
    }
}
