package q2;

public class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String id, String symbol, int quantity, double price){
        this.id =  id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String id, String symbol, int quantity){
        this.id =  id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price > 0){this.price = price;}
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return "ID: " + id + " symbol: " + symbol + " quantity: " + quantity + " price: " + price;
    }

    public static void main(String[] args){
        Trade trade = new Trade("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade("T1", "APPL", 100, 15);
        //trade.setPrice(8.00);
        System.out.println(trade.toString());

        Account account = new Account();
        account.setTotal_trades(trade);
        account.setTotal_trades(trade2);
        Trader trader = new Trader(account);
        System.out.println("Total trade is: " + account.getTotal_trades());

    }
}

