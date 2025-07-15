import java.util.Scanner;

public class Name_Ntimes {

     public void print(int count,int n,String name) {
          if(count>n)
             return;
          System.out.println(name);
          
          print(count+1,n,name);
          
       }
    public static void main(String args[])   {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            Name_Ntimes ob=new Name_Ntimes();
            int count=1;
            String name=sc.next();
            ob.print(count,n,name);
       }
}
