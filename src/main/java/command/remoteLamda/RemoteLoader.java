package command.remoteLamda;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteController rc = new RemoteController(4);

        CellingFan fan = new CellingFan("living room");
        GarageDoor door = new GarageDoor("main entry");
        Hottub hottub = new Hottub();
        Light light = new Light("kitchen");
        TV tv = new TV("living room");
        Stereo stereo = new Stereo("whole house");

        rc.setCommand(0, door::up, door::down);
        rc.setCommand(1, fan::High, fan::stop);
        rc.setCommand(2, light::on, light::off);

        Command stereoWithCD = ()->{
            stereo.on(); stereo.setCD();stereo.setVolume(10);
        };
        rc.setCommand(3,stereoWithCD, stereo::off);

        System.out.println(rc.toString());
        rc.onButtonPressed(1);
        rc.onButtonPressed(2);
        rc.onButtonPressed(3);
        rc.onButtonPressed(0);
        rc.offButtonPressed(0);
        rc.offButtonPressed(3);
        rc.offButtonPressed(2);
        rc.offButtonPressed(1);



    }
}
