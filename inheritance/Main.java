package q1;

public class Main {
    public static void main(String[] args){
//        Trade trade = new Trade("T1", "APPL", 100, 15.25);
//        Trade trade2 = new Trade("T1", "APPL", 100, 15);
//        //trade.setPrice(8.00);
//        System.out.println(trade.toString());
//
//        Account account = new Account();
//        account.setTotal_trades(trade);
//        account.setTotal_trades(trade2);
//        Trader trader = new Trader(account);
//        System.out.println("Total trade is: " + account.getTotal_trades());
//        BondTrade bond = new BondTrade("B1", "BBL", 100, 12.0, 1000);
//        System.out.println(bond.toString());
//        bond.calcDividend();

        FundTrade fund = new FundTrade("F1", "FFL", 20, 18.0, 21.6F);
        System.out.println(fund.toString());
        fund.calcDividend();

//        Client client = new Client("Emma", "Odametey");
//        System.out.println(client.getMembership());
//        client.addTrade(bond);
//        client.addTrade(fund);
//        System.out.println(client.getPoints());
//
//        System.out.println(client.getMembership());
//
//        System.out.println("demonstarting for 15 points");
//        for(int i = 0; i < 15; i++){
//            Trade newtrade = Trade("A"+i, "A"+ i+ i, i *5,i)
//        }


    }
}
