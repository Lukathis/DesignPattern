package adapter.example;

public class Client {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyFake = new TurkeyAdapter(turkey);

        turkeyFake.quack();
        turkeyFake.fly();
    }
}
