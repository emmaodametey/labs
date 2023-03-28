package lab1;

public class RandomGenQ6 {
    public RandomGenQ6(){}

    public void generateSixRandoms(int limit){
        for(int i = 0; i < limit; i++){
            int rand = (int)(Math.random()*49) +1;
            System.out.println(rand);
        }
    }
    public static void main(String[] args) {
        int max = 10;
        RandomGenQ6 rand = new RandomGenQ6();
        rand.generateSixRandoms(max);
    }
}
