package q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionTwo {
    private List<Integer> arrayOfSix = new ArrayList<>();

    public QuestionTwo(){
        createArray();
    }

    public void createArray(){
        while(arrayOfSix.size() < 6){
            int random = (int) (Math.random()*49) + 1;
            if(!arrayOfSix.contains(random)){
                arrayOfSix.add(random);
            }
        }
//        for (int i = 0 ; i < len; i++){
//            int random = (int) (Math.random()*49) + 1;
//            if ( i > 0 ){
//                for(int j = 0; j < i; j++){
//                    while(random == arrayOfSix[j])
//                        random = (int) (Math.random()*49) + 1;
//                }
//
//            }
//
//            arrayOfSix[i] = random;
//        }

    }

//    public void insertionSort(){
//
//        int max = arrayOfSix[0];
//        //int[] returnArr = arr;
//
//        for (int i = 0; i < arrayOfSix.length; i++){
//
//            for(int j = 0; j < arrayOfSix.length; j ++ ){
//                max = arrayOfSix[i];
//                if(arrayOfSix[i] < arrayOfSix[j]){
//                    arrayOfSix[i] = arrayOfSix[j];
//                    arrayOfSix[j] = max;
//
//                }
//            }
//        }
//    }

//    @Override
//    public String toString() {
//        return "QuestionTwo{" +
//                "arrayOfSix=" + Arrays.toString(arrayOfSix) +
//                '}';
//    }
//
//    public int[] getArrayOfSix() {
//        return arrayOfSix;
//    }

    @Override
    public String toString() {
        return "QuestionTwo{" +
                "arrayOfSix=" + arrayOfSix +
                '}';
    }
}
