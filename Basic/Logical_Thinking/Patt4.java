import java.util.Scanner;

public class Patt4 {
    void Print(int n){
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Patt4 ob=new Patt4();
        ob.Print(n);
    }
}
