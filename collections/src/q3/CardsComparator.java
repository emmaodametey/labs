package q3;

import java.util.Comparator;

public class CardsComparator implements Comparator<PlayingCard> {

    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        int result = o1.getCardPosition() - o2.getCardPosition();
        if(result == 0){
            return o1.getCardSuite() - o2.getCardSuite();
        }

        return result;
    }

}
