package command.simpleremoteLamda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Light {
    private String name;

    public void lightOn() {
        System.out.println(name + "light is on");
    }
    public void lightOff() {
        System.out.println(name + "light is off");
    }
}
