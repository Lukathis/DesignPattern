package state.before;

public class Client {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}
