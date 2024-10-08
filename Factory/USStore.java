public class USStore extends Store {
    @Override
    public Computer createAComputer(String type, String ram, String hdd, String cpu) {
        if (type.equals("Laptop")) {
            Laptop laptop = new Laptop(ram, hdd, "M2", "Apple", 1080, 2048);
            return laptop;
        } else {
            Desktop desktop = new Desktop(ram, hdd, "M2", "Apple", "Apple", "Apple");
            return desktop;
        }
    }
}
