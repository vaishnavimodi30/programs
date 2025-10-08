/* Q3. WAP to replace all the 0’s with 1’s in your array.
 Your array is [26, 0, 67, 45, 0, 78, 
    54, 34, 10, 0, 34] 
*/
class Replace{
    public void replace(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                a[i]=1;
            }
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String [] args){
        int a[]={26, 0, 67, 45, 0, 78, 
    54, 34, 10, 0, 34};
    Replace array= new Replace();
    array.replace(a);
    }
} 