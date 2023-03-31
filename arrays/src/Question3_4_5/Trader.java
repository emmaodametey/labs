package Question3_4_5;

public class Trader {
    private String name;
    private Account account;

    public Trader(Account account, String name){
        this.account = account;
        this.name = name;
    }

    public void addTrade(Trade trade){
        account.addTradeToArray(trade);
        account.setTotal_trades(trade);
    }
}
