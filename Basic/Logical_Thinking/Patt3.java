import java.util.Scanner;
// "Number Triangle Pattern"
public class Patt3 {
    void print(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Patt3 ob=new Patt3();
        ob.print(n);

    }
}
