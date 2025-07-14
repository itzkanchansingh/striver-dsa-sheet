import java.util.Scanner;

public class Patt21 {
      void print(int n) {
        for (int i = 1; i <= 2*(n-1); i++) {
             for(int j=1;j<=2*(n-1);j++){
             
             if(i==1 || j==1 || i==2*(n-1) || j==2*(n-1))
                System.out.print(n);
             else if(i==2||j==2||i==2*(n-2)||j==2*(n-2))
                 System.out.print(n-1);
             else if(i==3||j==3||i==2*(n-3)||j==2*(n-3))
                 System.out.print(n-2);
             else{
                System.out.print(n-3);
             }
                
            
         }
         System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Patt21 ob = new Patt21();
        ob.print(n);

    }
}
