import java.util.Scanner;

public class Reverse_Array {
    static void print(int arr[],int n){
        System.out.println("Elements of an Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int arr[],int n) {
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        print(ans,n);
       }
     public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
           int n = 5;
      int arr[] = new int[5];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      print(arr, n);
      reverseArray(arr, n);
       }
}
