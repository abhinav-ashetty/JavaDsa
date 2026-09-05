import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Perfect number:");
        int num = sc.nextInt();
        int sum = 1;
        for(int i=2;i<= Math.sqrt(num);i++){
            if(num % i == 0){
                sum += i;
                if(i != num/i){
                    sum += num/i;
                }
            }
        }
        if(sum == num){
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
    }
}
