package command.simpleremote;

import lombok.Data;

@Data
public class LightOnCommand implements Command{
    Light light = new Light();

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
