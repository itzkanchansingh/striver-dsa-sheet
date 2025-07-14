import java.util.Scanner;
// Increasing Letter Triangle Pattern
public class Patt14 {
    void Print(int n){
        
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      Patt14 ob=new Patt14();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}
