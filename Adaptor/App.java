public class App {
    public static void main(String[] args) throws Exception {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        duck.fly();
        turkey.fly();

        duck.quack();
        turkey.gobble();

        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        System.out.println(" duck.fly();");
        duck.fly();
        System.out.println(" turkey.fly();");
        turkey.fly();
        System.out.println(" adapter.fly();");
        adapter.fly();
        System.out.println(" duck.quack();");
        duck.quack();
        System.out.println(" turkey.gobble();");
        turkey.gobble();
        System.out.println(" adapter.quack();");
        adapter.quack();
    }
}
