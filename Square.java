/*Q9. WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. */
class Square{
    public void replace(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i-1]*arr[i-1];       
            }
        }
        System.out.print("Updated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={12, 3, -19, 29, 5, -61, 44, 7, -9 } ;
        Square  ob =new Square();
        ob.replace(arr);
    }
}    