 import java.util.Scanner;
// pyramid pattern reverse
public class Patt8 {
    void Print(int n) {
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
        Patt8 ob = new Patt8();
        ob.Print(n);
    }
}
 
    
