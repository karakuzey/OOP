public abstract class Computer {
    private String ram;
    private String hdd;
    private String cpu;
    private String brand;

    public Computer(String ram, String hdd, String cpu, String brand) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ram : " + getRam() + " , hdd :" + getHdd() + " , cpu : " + getCpu() + " , brand : " + getBrand();
    }
}