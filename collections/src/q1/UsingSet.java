package q1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsingSet {
    private Set<Integer> setOfSix = new HashSet<>();
    public UsingSet(){
        createSet(6);
    }


    public void createSet(int len){
        while(setOfSix.size() < len){
            int random = (int) (Math.random()*49) + 1;
            setOfSix.add(random);
        }
    //        for (int i = 0 ; i < len; i++){
    //            int random = (int) (Math.random()*49) + 1;
    //            if(!arrayOfSix.contains(random)){
    //                arrayOfSix.add(random);
    //            }
    //        }
    }

    @Override
    public String toString() {
        return "UsingSet{" +
                "setOfSix=" + setOfSix +
                '}';
    }
}
