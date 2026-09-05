import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num = sc.nextInt();
        int n = String.valueOf(num).length();
        int sum=0;
        int originalNum = num;
        for(int i=0;i<n;i++){
            int r = num % 10;
            sum += Math.pow(r,n);
            num /= 10;
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
