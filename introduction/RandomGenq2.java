
public class RandomGen {
    private int rand;


    public  RandomGen(int number){
        this.rand = number;
        System.out.println("random number is " + rand + "\n");
        if(rand % 2 ==0){
            System.out.println("number was even\n");
        }
        else{
            System.out.println("number was odd\n");
        }
    }

    public void categorize(){
        if(this.rand == 0) {System.out.println("Frozen");}
        else if(this.rand >= 1 && this.rand <= 14){System.out.println("cold");}
        else if(this.rand >= 15 && this.rand <= 24){System.out.println("cool");}
        else if(this.rand >= 25 && this.rand <= 40){System.out.println("warm");}
        else if(this.rand >= 41 && this.rand <= 60){System.out.println("hot");}
        else if(this.rand >= 61 && this.rand <= 80){System.out.println("very hot");}
        else if(this.rand >= 81 && this.rand <= 99){System.out.println("extremely hot");}
        else{System.out.println("boiling");}



//        0        frozen
//        1-14    cold
//        15-24    cool
//        25-40    warm
//        41-60    hot
//        61-80    very hot
//        81-99    extremely hot
//        100        boiling
    }


}

