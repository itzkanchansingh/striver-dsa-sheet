import java.util.Scanner;

public class Patt19 {
    void Print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
             for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Patt19 ob = new Patt19();
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        ob.Print(nu);

    }
}
