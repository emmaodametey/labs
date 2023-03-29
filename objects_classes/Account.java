package q2;

public class Account {
    private double  total_trades;

//    public Account(int total_trades){
//        this.total_trades = total_trades;
//
//    }

    public void setTotal_trades(Trade total_trades) {
        this.total_trades += total_trades.getQuantity() * total_trades.getPrice();
    }

    public double getTotal_trades() {
        return this.total_trades;
    }
}
