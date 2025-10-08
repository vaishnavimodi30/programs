/*Q2.Wap enter an array and find the sum and count of odd element .*/
import java.util.Scanner;
class Sum {
    int sum = 0;
    int count = 0;
    public void add(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {  
                sum = sum + a[i];
                count++;
            }
        }
        System.out.println("Sum of all odd elements is : " + sum);
        System.out.println("Count of odd elements = " + count);
    }
}
class Array1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Sum obj = new Sum();
        obj.add(a);
    }
}
