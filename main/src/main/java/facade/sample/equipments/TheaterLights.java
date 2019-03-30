package facade.sample.equipments;

public class TheaterLights {

    public void on() {
        System.out.println("Lights on");
    }

    public void dim(int val) {
        System.out.println("Light dim to: " + val);
    }

}
