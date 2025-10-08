/* WAP to check the prime number if the number is prime find the sum of that number.*/
import java.util.Scanner;

class Prime {
    public int isPrime(int n) {
        int a = 1;
        if (n <= 1) {
            a = 0; 
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    a = 0;
                }
            }
        }
        return a;
    }
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public void Main(int n) {
        if (isPrime(n) == 1) { 
            System.out.println(n + " is a prime number.");
            System.out.println("Sum of digits = " + sumOfDigits(n));
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Prime obj = new Prime();
        obj.Main(num);
    }
}
