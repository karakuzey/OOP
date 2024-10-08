public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("tv is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("tv is now off");
    }

    public void changeChannel() {
        System.out.println("channel changed");
    }
}
// concrete receiver
