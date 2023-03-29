package q1;

public class FundTrade extends Trade{

    private final float dividendPercentage;
    public FundTrade(String id, String symbol, int quantity, double price, float percentage) {
        super(id, symbol, quantity, price);
        this.dividendPercentage =  percentage;
    }

    @Override
    public  void calcDividend(){
        double dividend = (this.dividendPercentage /100) * this.getPrice();
        System.out.printf("Fund Trade dividend is $%.2f\n", dividend);
    }

    @Override
    public String toString() {
        return "FundTrade{" + super.toString() +
                ", dividendPercentage=" + dividendPercentage +
                '}';
    }
}
