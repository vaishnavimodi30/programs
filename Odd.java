/*Q7.Wap enter an array and print the square of the element which is on odd position.*/
import java.util.Scanner;
class Odd{
    public void square(int a[]){
        System.out.println("Square of odd position element are");
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.println(a[i]*a[i]);
            }
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
        Odd obj =new Odd();
        obj.square(a);
    }
    
}