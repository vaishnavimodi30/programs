/*1. Write a Java program to find all prime numbers between
 two given numbers and calculate their sum. 
solved it using method */
import java.util.Scanner;

class Samp {
    public int prime(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void prime(int s, int e) {
        int sum = 0;
        System.out.println("Prime numbers between " + s + " and " + e + " are:");
        for (int i = s; i <= e; i++) {
            if (prime(i) == 1) {  
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of primes = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int s = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int e = sc.nextInt();

        Samp a = new Samp();
        a.prime(s, e);
    }
}
