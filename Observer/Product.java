import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private double price;
    private List<Observer> observers;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double newPrice) {
        if (newPrice < getPrice()) {
            notifyObservers();
        }
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void appendObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }
}
