import java.util.Scanner;

public class Patt16 {
       void Print(int n ){
           char ch='A';
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
       public static void main(String args[]){
      Patt16 ob=new Patt16();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}
