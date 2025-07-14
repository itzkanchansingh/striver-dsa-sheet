import java.util.Scanner;
// Reverse Right-Angled Triangle Pattern (with stars)
public class Patt5 {
    void Print(int n){
     for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Patt5 ob=new Patt5();
        ob.Print(n);
    }
}
