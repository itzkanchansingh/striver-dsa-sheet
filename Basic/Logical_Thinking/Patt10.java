import java.util.Scanner;
// Hill Pattern (Incomplete Diamond)
class Patt10{
    void Print(int n){
        for (int i = 1; i < 2*n; i++) {
           int s = i <= n ? i : 2 * n - i;
            for(int j=1;j<=s;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt10 ob = new Patt10();
        ob.Print(n);
    }
}