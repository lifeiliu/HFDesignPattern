package command.simpleremote;

import lombok.Data;

@Data
public class LightOffCommand implements Command{
    Light light = new Light();

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
