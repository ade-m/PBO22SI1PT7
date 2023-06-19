import model.Engine;
import model.Mobil;
import model.Sedan;
import model.SUV;
public class App {
    public static void main(String[] args) throws Exception {
        //dependency
        Mobil mobil = new Mobil();
        mobil.start();
        mobil.stop();
        Sedan vios = new Sedan();
        Mobil mobil2 =  new Sedan();
        Mobil mobil3 =  new SUV();
        vios.getStatus();
    }
}
