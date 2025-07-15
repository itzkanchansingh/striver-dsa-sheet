import java.util.*;
public class Print_N_to_1 {
    public void print(int n) {
          if(n==0)
             return;
          System.out.println(n); 
          print(n-1);
       }
     public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            Print_N_to_1 ob=new Print_N_to_1();
            ob.print(n);
       }
}
