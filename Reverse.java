/*Q10.Wap enter an array and print it in reverse order. */
import java.util.Scanner;
class Reverse{
    public void rev(int a[]){
        System.out.print("Reverse Order of an Array :");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Reverse a1 =new Reverse();
        a1.rev(a);
    }
}