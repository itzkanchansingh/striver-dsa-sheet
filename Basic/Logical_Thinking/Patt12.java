import java.util.Scanner;
// Number Crown Pattern
public class Patt12 {
    void Print(int n){
       for (int i = 1; i <= n; i++) {
    // Print left numbers
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    // Print spaces
    for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }

    // Print right numbers
    for (int j = i; j >= 1; j--) {
        System.out.print(j);
    }

    System.out.println();
}

    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt12 ob = new Patt12();
        ob.Print(n);
    }
}
