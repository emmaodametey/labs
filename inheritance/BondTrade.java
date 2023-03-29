package q1;

public class BondTrade extends Trade{
    private final double  dividend ;
    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;

    }

    @Override
    public void calcDividend() {
        System.out.println("Bond Trade dividend is  " + dividend);
    }

    @Override
    public String toString() {
        return "BondTrade{" + super.toString() +
                " dividend=" + dividend +
                '}';
    }
}
