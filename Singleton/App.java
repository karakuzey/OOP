public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();
    }
}
