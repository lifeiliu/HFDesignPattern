package command.simpleremote;

public class RemoteController {
    Command slot;
    public RemoteController(){
    }
    public void setSlot(Command command) {
        this.slot = command;
    }
    public void buttonPressed() {
        slot.execute();
    }
    public void undoPressed() {
        slot.undo();
    }
}
