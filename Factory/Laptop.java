public class Laptop extends Computer {
    private int screenWidth;
    private int screenHeight;

    public Laptop(String ram, String hdd, String cpu, String brand, int screenHeight, int screenWidth) {
        super(ram, hdd, cpu, brand);
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " , screen height : " + getScreenHeight() + " , screen width : " + getScreenWidth();
    }
}
