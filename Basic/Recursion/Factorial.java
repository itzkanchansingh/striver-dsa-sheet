import java.util.*;

public class Factorial {
    public int print(int n) {
          if(n==0)
             return 1;
          
         return  n*print(n-1);
       }
     public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            Factorial ob=new Factorial();
            System.out.println(ob.print(n));
       }
}
