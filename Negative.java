/* 8. Move all negative numbers to beginning and positive to end with constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6    
Output: -12 -13 -5 -7 -3 -6 11 6 5*/
class Negative {
    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if(j!=i){
                int temp = a[i];
                for(int k=i;k>j;k--){
                    a[k]=a[k-1];
                }
                a[j] = temp;
                }
                j++;
            }
        }
        System.out.println("Rearranged array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
