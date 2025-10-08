/* Q6. WAP to enter an array and find the duplicate elements and also their count. */
import java.util.Scanner;
class Duplicate {
    public void duplicate(int a[]) {
        int count = 0;
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements = " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Duplicate obj = new Duplicate();
        obj.duplicate(a);
    }
}
