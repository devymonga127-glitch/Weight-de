public abstract class WeightLoss implements IWeightLoss {
    private String customerName;
    private double weightLoss;

    public WeightLoss(WeightLossModel model) {
        this.customerName = model.CustomerName;
        this.weightLoss = model.WeightLoss;
    }

    @Override
    public String GetCustomerName() {
        return customerName;
    }

    @Override
    public double GetWeightLoss() {
        return weightLoss;
    }
}
