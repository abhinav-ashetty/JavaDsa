import java.util.Scanner;
public class GcdAndLcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD and LCM:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int originalNum1 = num1;
        int originalNum2 = num2;
        while(num2 != 0){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        int gcd = num1;
        int lcm = (originalNum1 * originalNum2) / gcd;
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
}
/*
🧠 Interview questions you should now be able to answer

Q: What algorithm did you use for GCD?

Euclidean Algorithm.

Q: What is its complexity?

O(log(min(a,b))) time and O(1) space.

Q: How do you calculate LCM from GCD?

LCM(a,b) = |a × b| / GCD(a,b).
*/