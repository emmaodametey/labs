package q2;

public class Trader {
    private String name;
    private Account account;

    public Trader(Account account){
        this.account = account;
        this.name = name;
    }

    public void addTrade(Trade trade){
        account.setTotal_trades(trade);
    }
}
