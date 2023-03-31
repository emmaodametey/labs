import Question3_4_5.Account;
import Question3_4_5.Trade;
import Question3_4_5.Trader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //QuestionOne question = new QuestionOne();
//        QuestionTwo question2 = new QuestionTwo();
        //System.out.println(question2);
//        System.out.println(question2);
        //Arrays.sort(question2.getArrayOfSix());
//        question2.insertionSort();
//        System.out.println("After sort");
//        System.out.println(question2);
        Account account = new Account();
        Trader trader = new Trader(account, "emma");
        Trade trade1 = new Trade("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade("T1", "APPL", 100, 4);
        account.addTradeToArray(trade1);
        account.addTradeToArray(trade2);
        account.setTotal_trades(trade1);
        account.setTotal_trades(trade2);
        System.out.println("Total trade is: " + account.getTotal_trades());

        for(int i = 0; i < account.getTrades().length; i++){
            if(account.getTrades()[i] != null){
                System.out.println(account.getTrades()[i]);
            }

        }
        System.out.println("print trade prices less than 10");
        for(int i = 0; i < account.getTrades().length; i++){
            Trade thisTrade = account.getTrades()[i];
            if( thisTrade != null && thisTrade.getPrice() < 10){
                System.out.println(account.getTrades()[i]);
            }

        }
    }
}