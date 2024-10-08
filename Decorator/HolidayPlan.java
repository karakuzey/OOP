public class HolidayPlan implements Payable {
    private String planName;
    private double planPrice;

    public HolidayPlan(String planName, double planPrice) {
        this.planName = planName;
        this.planPrice = planPrice;
    }

    public String getPlanName() {
        return planName;
    }

    public double getPlanPrice() {
        return planPrice;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setPlanPrice(double planPrice) {
        this.planPrice = planPrice;
    }

    @Override
    public double pay() {
        return getPlanPrice();
    }
}
