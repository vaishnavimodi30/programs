import java.util.Scanner;
class Product {
    public int prime(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public int product(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        return product;
    }
    public void calculate(int start, int end) {
        int sum = 0;

        System.out.print("Prime numbers in the range: ");
        for (int i = start; i <= end; i++) {
            if (prime(i) == 1) {
                System.out.print(i + " "); 
                sum += i;
            }
        }

        System.out.println("\nSum of prime numbers = " + sum);
        System.out.println("Product of digits of sum = " + product(sum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        Product obj = new Product();
        obj.calculate(start, end);
    }
}
