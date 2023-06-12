import model.Engine;
import model.Mobil;
public class App {
    public static void main(String[] args) throws Exception {
        //dependency
      
        Mobil mobil = new Mobil(engine);
        Engine engine = new Engine();
        Engine engine2 = new Engine();
        mobil.start();
        mobil.stop();
    }
}
