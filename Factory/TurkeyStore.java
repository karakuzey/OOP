public class TurkeyStore extends Store {

    @Override
    public Computer createAComputer(String type, String ram, String hdd, String cpu) {
        // TODO Auto-generated method stub
        if (type.equals("Laptop")) {
            if (ram.equals("64GB")) {
                Laptop laptop = new Laptop(ram, hdd, cpu, "HP", 1080, 2048);
                return laptop;
            }
            Laptop laptop = new Laptop(ram, hdd, cpu, "HP", 1080, 1280);
            return laptop;
        } else {
            Desktop desktop = new Desktop(ram, hdd, cpu, "HP", "HP", "Asus");
            return desktop;
        }
    }
}
