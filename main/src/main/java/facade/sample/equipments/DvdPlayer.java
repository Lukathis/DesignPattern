package facade.sample.equipments;

public class DvdPlayer {

    public void on() {
        System.out.println("Turning on the DVD player");
    }

    public void play(String movie) {
        System.out.println(String.format("Movie %s starts!", movie));
    }

    public void stop() {
        System.out.println("The current movie stopped");
    }

    public void off() {
        System.out.println("Movie ends");
    }
}
