public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Product product) {
        System.out.println("mr,ms : " + this.name + " you can buy :: " + product.getName() + " cheaper now");
    }
}
