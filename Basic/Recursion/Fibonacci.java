import java.util.Scanner;

public class Fibonacci {
    public int print(int n) {
          if(n==0)
             return 0;
          if(n==1)
             return 1;
          
         return print(n-1)+print(n-2);
       }
     public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            Fibonacci ob=new Fibonacci();
            System.out.println(ob.print(n));
       }
}
