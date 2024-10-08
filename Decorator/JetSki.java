public class JetSki extends HolidayDecorator {
    private double price;
    private int howManyHours;

    public JetSki(double price, int howManyHours, Payable payable) {
        this.price = price;
        this.howManyHours = howManyHours;
        this.holidayPlan = payable;
    }

    public int getHowManyHours() {
        return howManyHours;
    }

    public double getPrice() {
        return price * getHowManyHours();
    }

    public void setHowManyHours(int howManyHours) {
        this.howManyHours = howManyHours;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double pay() {
        return holidayPlan.pay() + getPrice();
    }
}
