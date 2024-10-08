public class Desktop extends Computer {
    public String keyboardBrand;
    public String mousedBrand;

    public Desktop(String ram, String hdd, String cpu, String brand, String keyboardBrand, String mouseBrand) {
        super(ram, hdd, cpu, mouseBrand);
        this.keyboardBrand = keyboardBrand;
        this.mousedBrand = mouseBrand;
    }

    public String getKeyboardBrand() {
        return keyboardBrand;
    }

    public void setKeyboardBrand(String keyboardBrand) {
        this.keyboardBrand = keyboardBrand;
    }

    public String getMousedBrand() {
        return mousedBrand;
    }

    public void setMousedBrand(String mousedBrand) {
        this.mousedBrand = mousedBrand;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " , keyboard brand is : " + getKeyboardBrand() + " , mouse brand : "
                + getMousedBrand();
    }
}
