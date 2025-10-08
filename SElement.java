/* Q5. WAP to check if an array of integers contains two specified elements. */
import java.util.Scanner;
class SElement {
    public void search(int a[], int f, int s) {
        int countf = 0;  
        int counts = 0;  
        for (int i = 0; i < a.length; i++) {
            if (a[i] == f) {
                countf++;
            }
            if (a[i] == s) {
                counts++;
            }
        }
        if (countf > 0 && counts > 0) {
            System.out.println("Both elements " + f + " and " + s + " are present in the array");
        } else if (countf == 0 && counts == 0) {
            System.out.println("Both element is Not present in the array");
        } else if (countf > 0) {
            System.out.println("Only first element " + f + " is present in the array");
        } else {
            System.out.println("Only second element " + s + " is present in the array.");
        }
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
        System.out.println("Enter the First Search Element: ");
        int f = sc.nextInt();
        System.out.println("Enter the Second Search Element: ");
        int s = sc.nextInt();
        SElement ob = new SElement();
        ob.search(a, f, s);
    }
}
