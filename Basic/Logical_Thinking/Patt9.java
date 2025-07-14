import java.util.Scanner;

public class Patt9 {
     void Print(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            // space
             for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void Printreverse(int n){
           for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }
            // space
             for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt9 ob = new Patt9();
        Patt9 ob1 = new Patt9();
        ob.Print(n);
        ob1.Printreverse(n);
    }
}
