package command.remoteLamda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum Speed {
    Low, Medium, High
}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CellingFan {
    private String location;
    private Speed speed;

    public CellingFan(String location) {
        this.location = location;
    }

    public void High() {
        speed = Speed.High;
        System.out.println(location + " ceiling fan is on high");
    }
    public void low() {
        speed = Speed.Low;
        System.out.println(location + " ceiling fan is on low");
    }
    public void Med() {
        speed = Speed.Medium;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void stop() {
        System.out.println(location + " ceiling fan is stopped");
    }

}
