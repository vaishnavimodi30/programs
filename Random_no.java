// Random class is used to generate random numbers
import java.util.Random;
import java.util.Scanner;

public class Random_no {
    public static void main(String[] args) {
        Random obj = new Random();

        int n = obj.nextInt(50);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many attempts do you want?");
        int atm = sc.nextInt();

        for (int i = 1; i <= atm; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess < n) {
                System.out.println("Your number is too small... Try again!");
            } else if (guess > n) {
                System.out.println("Your number is too big... Try again!");
            } else {
                System.out.println(" Congratulations! You guessed the right number!");
                break;
            }
        }
        System.out.println("The correct number was: " + n);
    }
}
