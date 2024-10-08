public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
// concrete receiver
