import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            if(num == 0 || num ==1) System.out.println("Factorial of " + num + " is 1");
            else{
                
                long factorial = 1;
                for(int i=2; i<=num; i++){
                    factorial *= i;
                }
                System.out.println("Factorial of " + num + " is: " + factorial);
            }
        }
    }
}
