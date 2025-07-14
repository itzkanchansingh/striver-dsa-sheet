import java.util.Scanner;
//square pattern 
public class Patt1 {
    void patt(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt1 obj = new Patt1();
        obj.patt(n);
    }
}
