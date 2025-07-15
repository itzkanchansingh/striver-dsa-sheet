import java.util.*;
public class N_Numbers {
    
       public void print(int count,int n) {
          if(count>n)
             return;
          System.out.println(count);
          count=count+1;
          print(count,n);
          
       }

       public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            N_Numbers ob=new N_Numbers();
            int count=1;
            ob.print(count,n);
       }
}
