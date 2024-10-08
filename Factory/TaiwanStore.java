public class TaiwanStore extends Store {
    @Override
    public Computer createAComputer(String type, String ram, String hdd, String cpu) {
        if (type.equals("Laptop")) {
            Laptop laptop = new Laptop(ram, hdd, cpu, "Lenovo", 1080, 2048);
            return laptop;
        } else {
            Desktop desktop = new Desktop(ram, hdd, cpu, "Lenovo", "Lenovo", "Lenovo");
            return desktop;
        }
    }
}
