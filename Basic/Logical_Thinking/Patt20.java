import java.util.Scanner;

public class Patt20 {
    void print(int n) {
        for (int i = 1; i <= n; i++) {
             for(int j=1;j<=n;j++){
             
             if(i==1 || j==1 || i==n || j==n)
                System.out.print("*");
                
             // print space.
             else System.out.print(" ");
         }
         System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Patt20 ob = new Patt20();
        ob.print(n);

    }
}
