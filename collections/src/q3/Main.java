package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
//        ArrayList<PlayingCard> cardArrayList = new ArrayList<>();
//        //Set<PlayingCard> deck = new TreeSet<>();
//        PlayingCard card1 = new PlayingCard('H', '9');
//        PlayingCard card2 = new PlayingCard('S', '7');
//        PlayingCard card3 = new PlayingCard('D', '7');
//        PlayingCard card4 = new PlayingCard('C', 'J');
//        cardArrayList.add(card1);
//        cardArrayList.add(card2);
//        cardArrayList.add(card3);
//        cardArrayList.add(card4);
//        Collections.sort(cardArrayList);
//        System.out.println("List after the use of" +
//                " Collection.sort() :\n" + cardArrayList);
        Dealer deal = new Dealer();
        System.out.println(deal.getDeck().size());
//        for(PlayingCard card: deck){
//            System.out.println(card.toString());
//        }
//        System.out.println(card1.equals(card2));
//        System.out.println(card1.hashCode() + ", " + card2.hashCode());
//        System.out.println(card1.getCardValues());
//        System.out.println(card1.getSuites());
//        System.out.println(card1.compareTo(card2));
    }


}
