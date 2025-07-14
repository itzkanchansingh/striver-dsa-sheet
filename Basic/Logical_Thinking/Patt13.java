import java.util.Scanner;

public class Patt13 {
    void Print(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      Patt13 ob=new Patt13();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}
