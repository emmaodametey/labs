package lab1;

public class RandomGenQ5 {
    public void multiplier(int number){
        for(int i = 1; i <= 12; i ++){
            int result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }

    public void getMultiplier(){
        for(int i = 0 ; i <= 10; i ++){
            multiplier(i);
        }
    }

    public static void main(String[] args){
        RandomGenQ5 multiplication = new RandomGenQ5();
        multiplication.getMultiplier();
    }
}
