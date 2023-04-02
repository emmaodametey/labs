package q3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SuitesAndValues {
    private final Set<Character> suites = new HashSet<>();
    private final Map<Character, Integer> cardValues = new HashMap<Character, Integer>();

    public SuitesAndValues(){
        createSuitesAndValues();
    }

    public Set<Character> getSuites() {
        return suites;
    }

    public Map<Character, Integer> getCardValues() {
        return cardValues;
    }

    private void createSuitesAndValues(){
        int i = 0;
        suites.add('S');
        suites.add('D');
        suites.add('C');
        suites.add('H');
        while (i < 8){
            cardValues.put((char) ('0'+i+2), i);
            i++;
        }
        cardValues.put('T', 8);
        cardValues.put('J', 9);
        cardValues.put('Q', 10);
        cardValues.put('K', 11);
        cardValues.put('A', 12);
    }

}
