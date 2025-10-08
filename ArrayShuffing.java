//Array shuffing
import java.util.Random;
import java.util.Scanner;
public class ArrayShuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int j = obj.nextInt(size);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("Shuffled array:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
