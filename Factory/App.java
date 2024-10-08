public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Store taiwanieseStore = new TaiwanStore();
        taiwanieseStore.addToStock("Desktop", "32GB", "SSD512GB", "Intel");
        taiwanieseStore.addToStock("Laptop", "16GB", "SSD256GB", "Intel");
        taiwanieseStore.addToStock("Desktop", "64GB", "SSD512GB", "AMD");
        System.out.println("taiwan store şeysi ");
        taiwanieseStore.printStock();
        Store turkeyStore = new TurkeyStore();
        turkeyStore.addToStock("Desktop", "16GB", "SSD512GB", "Intel");
        turkeyStore.addToStock("Laptop", "32GB", "SSD256GB", "AMD");
        turkeyStore.addToStock("Laptop", "64", "SSD256GB", "AMD");
        System.out.println("turkey store şeysi ");
        turkeyStore.printStock();
        Store usStore = new USStore();
        usStore.addToStock("Desktop", "32GB", "SSD512GB", "");
        usStore.addToStock("Laptop", "16GB", "SSD256GB", "");
        usStore.addToStock("Desktop", "64", "SSD512GB", "");
        System.out.println("bublar hep amerikanın oyunları");
        usStore.printStock();
    }
}
