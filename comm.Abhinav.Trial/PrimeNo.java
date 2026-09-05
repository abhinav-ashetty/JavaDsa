import java.util.Scanner;
public class PrimeNo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number:");
        int prime = sc.nextInt();
        boolean isPrime=true;
        if(prime<=1){
            isPrime=false;
        }
        for(int i=2;i<=Math.sqrt(prime);i++){
            if(prime%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(prime + " is a prime number.");
        } else {
            System.out.println(prime + " is not a prime number.");
        }
    }
}
/*
🧠 Why only √n?

This is very important for your interview.

Suppose:

n = 36

If 36 has factors:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6

Once you reach √36 = 6, you've covered the necessary factor pairs.

More generally, if a number n has a factor greater than √n, its corresponding pair factor must be less than √n.

Therefore, if no number from 2 through √n divides n, then n is prime.

Complexity

Your approach:

Time: O(√n)
Space: O(1)

That's much better than checking all numbers up to n.

🎯 Interview follow-up you should know

If the interviewer asks:

"Can you check whether a number is prime without using Math.sqrt()?"

You can write:

for (int i = 2; i * i <= prime; i++) {
    if (prime % i == 0) {
        isPrime = false;
        break;
    }
}

This is actually a nice version to remember.
*/
