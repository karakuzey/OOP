public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HolidayPlan holidayPlan = new HolidayPlan("basic", 200.0);
        System.out.println(holidayPlan.pay());

        ShipTravel shipTravel = new ShipTravel(holidayPlan, 100);
        System.out.println(shipTravel.pay());

        JetSki jetSki = new JetSki(50, 5, shipTravel);
        System.out.println(jetSki.pay());

    }
}
