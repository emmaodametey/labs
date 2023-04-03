package q3;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Dealer {
    private final SuitesAndValues suitesAndValues = new SuitesAndValues();
    private final ArrayList<PlayingCard> deck;

    public Dealer(){
        deck = new ArrayList<>();
        createDeck();
    }

    private void createDeck(){
        for(Character suite: suitesAndValues.getSuites()){
            for(Character value: suitesAndValues.getCardValues().keySet()){
                deck.add(new PlayingCard(suite, value));
            }
        }
    }

    public void shuffle(){
        int i = 0;
        while( i < 52){
            int random1 = (int)(Math.random())* 52;
            int random2 = (int)(Math.random())* 52;
            PlayingCard holdCard = deck.get(random1);
            deck.set(random1, deck.get(random2));
            deck.set(random2, holdCard);
            i++;
        }
    }

    public ArrayList<PlayingCard> getDeck() {
        return deck;
    }
}

