package facade.sample.equipments;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setVolume(int volume) {
        System.out.println("Set the volume to: " + volume);
    }
}
