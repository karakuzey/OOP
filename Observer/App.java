public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product pc = new Product("pc", 100.5);
        Person ali = new Person("ali");
        Person mehmet = new Person("mehmet");
        Person osman = new Person("osman");
        pc.appendObservers(osman);
        pc.appendObservers(mehmet);
        pc.appendObservers(ali);
        pc.setPrice(20.5);
    }
}
