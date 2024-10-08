import java.util.ArrayList;
import java.util.List;

public abstract class Store {
    private List<Computer> inStock;

    public Store() {
        this.inStock = new ArrayList<>();
    }

    public int addToStock(String type, String ram, String hdd, String cpu) {
        Computer computer = createAComputer(type, ram, hdd, cpu);
        inStock.add(computer);
        return inStock.size();
    }

    public abstract Computer createAComputer(String type, String ram, String hdd, String cpu);

    public void printStock() {
        for (Computer computer : inStock) {
            System.out.println(computer.toString());
        }
    }
}
