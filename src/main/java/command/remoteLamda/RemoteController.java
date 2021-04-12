package command.remoteLamda;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    int noButtons;

    public RemoteController(int noButtons) {
        this.noButtons = noButtons;
        onCommands = new Command[noButtons];
        offCommands = new Command[noButtons];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        for (int i = 0; i < noButtons; i++) {
            onCommands[i] = () -> { };
            offCommands[i] = () -> { };
        }
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
