package command.simpleremoteLamda;

public class SimpleRemoteControllerApp {
    public static void main(String[] args) {
        Light roomLight = new Light("study room");
        GarageDoor garageDoor = new GarageDoor();
        RemoteController simplyController = new RemoteController();
        simplyController.setSlot(roomLight :: lightOn);
        simplyController.buttonPressed();
        simplyController.setSlot(roomLight :: lightOff);
        simplyController.buttonPressed();
        simplyController.setSlot(garageDoor :: up);
        simplyController.buttonPressed();
        simplyController.setSlot(garageDoor :: lightOn);
        simplyController.buttonPressed();
        simplyController.setSlot(garageDoor :: lightOff);
        simplyController.buttonPressed();
        simplyController.setSlot(garageDoor :: down);
        simplyController.buttonPressed();

    }
}
