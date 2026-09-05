public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its digits:");  
        int num = sc.nextInt();
        int count =0;
        while(num!=0){
            num /= 10;
            count++;
        }
        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
