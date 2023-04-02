package q3;

import java.util.Set;
import java.util.TreeSet;

public class Dealer {
    private final SuitesAndValues suitesAndValues = new SuitesAndValues();
    private final Set<PlayingCard> deck;

    public Dealer(){
        deck = new TreeSet<>();
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

    }

    public Set<PlayingCard> getDeck() {
        return deck;
    }
}

