public class Greeting {
    private String greeting = "Hello";
    private String target = "world";

    public void setGreeting(String greeting){
        this.greeting = greeting;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String greet(){
        return greeting + " " + target;
    }

    public static void main(String[] args) {
        Greeting hello = new Greeting();
        String greet_emma = hello.greet("Emma");
        System.out.println(greet_emma);}


}
