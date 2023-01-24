public class ExamScore {
    public static void main(String[] args){
        int score = 100;
        if(score < 0 || score > 100){
            System.out.println("false");
        }
        if(score == 100){
            System.out.println("good!");
        }
    }
}
