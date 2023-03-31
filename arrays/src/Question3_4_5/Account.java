package Question3_4_5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double  total_trades;
    private Trade[] trades;
    private List<Trade> trades1 = new ArrayList<>();
    private int tradeIndex;



    public Account(){
        this.trades = new Trade[100];

    }

    public Trade[] getTrades() {
        return trades;
    }

    public List<Trade> getTrades1() {
        return trades1;
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
        this.trades[tradeIndex++] = trade;
    }

    public void addTradeToList(Trade trade){
        trades1.add(trade);
    }

    public int getTradeIndex() {
        return tradeIndex;
    }
}
