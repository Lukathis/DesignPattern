package command;

public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(String.format("Turn on the %s light", name));
    }

    public void off() {
        System.out.println(String.format("Turn off the %s light", name));
    }
}
