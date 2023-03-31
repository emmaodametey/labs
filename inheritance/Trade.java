package q1;


import java.time.LocalDateTime;
import java.util.Date;

public abstract class  Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;

    private LocalDateTime dateTime;

    public Trade(String id, String symbol, int quantity, double price){
        this.id =  id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        dateTime = LocalDateTime.now();
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
        return "ID: " + id + ", symbol: " + symbol + ", quantity: " + quantity + ", price: " + price + " ";
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public abstract void calcDividend();



}

