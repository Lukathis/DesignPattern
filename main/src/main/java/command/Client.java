package command;

public class Client {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living room");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenOnCommand = new LightOnCommand(kitchenLight);
        Command kitchenOffCommand = new LightOffCommand(kitchenLight);
        Command stereoOnCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffCommand = new StereoOffWithCDCommand(stereo);

        control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        control.setCommand(1, kitchenOnCommand, kitchenOffCommand);
        control.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(control);

        for (int i = 0; i < 3; i++) {
            control.onButtonPushed(i);
            control.offButtonPushed(i);
        }

        System.out.println("========Test Undo========");

        control.onButtonPushed(0);
        control.offButtonPushed(0);
        control.undoButton();
    }
}
