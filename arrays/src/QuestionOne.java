public class QuestionOne {
    private int[] arrayOne = new int[10];

    public QuestionOne(){
        for(int i = 0; i < arrayOne.length; i++){
            this.arrayOne[i] = i + 1;
            System.out.println(arrayOne[i]);
        }

    }
}
