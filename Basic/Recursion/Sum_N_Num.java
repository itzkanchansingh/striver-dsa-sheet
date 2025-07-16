import java.util.Scanner;

public class Sum_N_Num {
     public int print(int res,int n) {
          if(n==0)
             return res;
          res=res+n;
          return print(res,n-1);
       }
    public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            Sum_N_Num ob=new Sum_N_Num();
            int res=0;
            System.out.println(ob.print(res,n));
       }
}
