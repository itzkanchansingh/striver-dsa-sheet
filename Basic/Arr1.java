import java.util.Scanner;

public class Arr1 {
    // Search Element in Array
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    // Taking input from user
    for(int i=0;i<arr.length;i++){
     arr[i] =sc.nextInt();
    }
    // printing values of an Array 
    for(int i:arr){
        System.out.println("Values of Arrays are :"+i);
    }
    // Search value in an array 
    System.out.println("Enter the Value which you want to search in an array");
    int val=sc.nextInt();
    for(int i=0;i<arr.length;i++){
        if(arr[i]==val){
            System.err.println("data is present in an Array");
        }
        else{
            System.out.println("Data is not present ");
        }
    }
}
}
