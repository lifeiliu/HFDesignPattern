package command.simpleremote;

public class RemoteControllerApp {
    public static void main(String[] args) {
        Light roomLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand();
        lightOnCommand.setLight(roomLight);
        LightOffCommand lightOffCommand = new LightOffCommand();
        lightOffCommand.setLight(roomLight);
        RemoteController testController = new RemoteController();
        testController.setSlot(lightOnCommand);
        testController.buttonPressed();
        testController.setSlot(lightOffCommand);
        testController.buttonPressed();
        testController.undoPressed();
    }


}
