import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series:");
        int fib = sc.nextInt();
        if(fib <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: ");
            for(int i = 1; i <= fib; i++){
                System.out.print(a + " ");
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
        }
    }
}
