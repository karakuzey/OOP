public class ShipTravel extends HolidayDecorator {
    private double price;

    public ShipTravel(Payable payable, double price) {
        this.price = price;
        this.holidayPlan = payable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double pay() {
        // TODO Auto-generated method stub
        return holidayPlan.pay() + getPrice();
    }
}
