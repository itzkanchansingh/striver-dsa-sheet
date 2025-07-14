import java.util.Scanner;

public class Patt15 {
    void Print(int n ){
       for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=i;j<=n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
      Patt15 ob=new Patt15();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}
