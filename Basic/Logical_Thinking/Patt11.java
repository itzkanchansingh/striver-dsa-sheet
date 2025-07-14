import java.util.Scanner;
//  Binary Number Triangle Pattern
public class Patt11 {
     void Print(int n){
         int s=1;
        for (int i = 1; i<=n; i++) {
            if(i%2==0)s=0;
            else s=1;
            for(int j=1;j<=i;j++){
                System.out.print(s);
                s=1-s;
            }
            System.out.println();

        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt11 ob = new Patt11();
        ob.Print(n);
    }
}
