public class demo12 {
    public static void main(String[] args){
        int x = 5;
        int y;
        if (x >= 3){
            y = 2 * x + 1;
        } else if(x >= -1 && x < 3){
            y = 2*x;
        } else{
            y = 2 * x - 1;
        }
        System.out.println("y的值是："+y);
    }
}
