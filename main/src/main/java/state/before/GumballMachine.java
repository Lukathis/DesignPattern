package state.before;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returning");
        } else if (state == NO_QUARTER) {
            System.out.println("There's no quarter in the machine");
        } else if (state == SOLD_OUT) {
            System.out.println("You did not insert a quarter");
        } else if (state == SOLD) {
            System.out.println("You can't eject, you've already turned the crank");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("Giving gumball...");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("You did not insert quarter yet");
        } else if (state == SOLD_OUT) {
            System.out.println("There's no gumball");
        } else if (state == SOLD) {
            System.out.println("Turning twice doesn't get two gumballs");
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == NO_QUARTER) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, sold out");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }

    }
}
