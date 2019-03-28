package command;

public class RemoteControl {

    public static final int slotNum = 3;
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotNum; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoButton() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======Remote Control======\n");
        for (int i = 0; i < slotNum; i++) {
            sb.append(String.format("[Slot %s : %s]\n", i, onCommands[i].getClass().getName()));
        }
        return sb.toString();
    }
}
