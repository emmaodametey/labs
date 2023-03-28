package lab1;

public class RandomGenQ4 {

    public void generate(){
        int x;
        do{

            x = (int)(Math.random() * 4 );
            System.out.println(x);
        }while(x != 0);
    }

    public static void main(String[] args){
        RandomGenQ4 gen = new RandomGenQ4();
        gen.generate();
    }
}
