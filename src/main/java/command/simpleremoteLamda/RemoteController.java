package command.simpleremoteLamda;

import lombok.Data;

@Data
public class RemoteController {
    Command slot;
    public void buttonPressed(){
        slot.execute();
    }
}
