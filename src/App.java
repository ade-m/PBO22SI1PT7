import model.Engine;
import model.Mobil;
public class App {
    public static void main(String[] args) throws Exception {
        //dependency
        Engine engine = new Engine();
        Mobil mobil = new Mobil();
        Engine engine2 = new Engine();
        mobil.start(engine);
        mobil.stop(engine2);
    }
}
