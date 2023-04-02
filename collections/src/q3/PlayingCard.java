package q3;

public class PlayingCard implements Comparable{
    private SuitesAndValues suitesAndValues = new SuitesAndValues();
    private char cardSuite;
    private char cardValue;
    private int cardPosition;

    public PlayingCard(char suite, char value){
        if(suitesAndValues.getSuites().contains(suite) && suitesAndValues.getCardValues().containsKey(value)) {
            this.cardSuite = suite;
            this.cardValue = value;
            this.cardPosition = suitesAndValues.getCardValues().get(value);
        }
    }
    @Override
    public int hashCode() {
        return this.cardPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){return  true;}
        if(obj instanceof PlayingCard && ((PlayingCard) obj).cardValue == this.cardValue){
           return true;
        }
        return false;
    }

    public int getCardPosition() {
        return cardPosition;
    }

    public char getCardSuite() {
        return cardSuite;
    }


    public char getCardValue() {
        return cardValue;
    }

    @Override
    public int compareTo(Object o) {

        PlayingCard otherCard = (PlayingCard) o;
        int result = this.cardPosition - otherCard.cardPosition;
        if(result == 0){
            return this.cardSuite - otherCard.cardSuite;
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "cardSuite=" + cardSuite +
                ", cardValue=" + cardValue +
                '}';
    }
}
