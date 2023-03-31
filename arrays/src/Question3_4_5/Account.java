package Question3_4_5;

public class Account {
    private double  total_trades;
    private Trade[] trades;
    private int tradeIndex;



    public Account(){
        this.trades = new Trade[100];

    }

    public Trade[] getTrades() {
        return trades;
    }

    public void setTrades(Trade[] trades) {

        this.trades = trades;
    }


    public void setTotal_trades(Trade trade) {
        this.total_trades += trade.getQuantity() * trade.getPrice();

    }

    public double getTotal_trades() {
        return this.total_trades;
    }

    public void addTradeToArray(Trade trade){
        this.trades[tradeIndex] = trade;
        this.tradeIndex++;
    }


}
