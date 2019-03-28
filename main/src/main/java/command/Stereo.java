package command;

public class Stereo {

    public String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Turn on the stereo");
    }

    public void setCD() {
        System.out.println("Set CD");
    }

    public void setVolumn(int value) {
        System.out.println(String.format("Set volume to %s", value));
    }

    public void pullOutCD() {
        System.out.println("Pull CD out");
    }

    public void off() {
        System.out.println("Turn off the stereo");
    }

}
