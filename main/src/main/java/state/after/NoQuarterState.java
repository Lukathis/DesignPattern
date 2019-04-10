package state.after;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There's no quarter in the machine");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but please insert quarter first");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert a quarter first");
    }
}
