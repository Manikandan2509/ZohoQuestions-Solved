package src;

public class FindPerfectSquareBetweenTwoNumbers {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 100;
        for (int i = 0; i < num2/2 +1; i++) {
            if(i*i > num1 && i*i <=num2){
                System.out.print(i*i+" ");
            }
        }
    }
}
