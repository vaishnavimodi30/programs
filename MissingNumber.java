class MissingNumber {
    public static int find(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != i) {
                return i; 
            }
        }
        return n; 
    }
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 6, 9};
        int n = a.length;
        int m = 10;
        MissingNumber b =new MissingNumber();
        System.out.println("Smallest missing number is: " + b.find(a, n));
    }
}
