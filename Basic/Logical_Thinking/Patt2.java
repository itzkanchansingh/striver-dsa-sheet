import java.util.Scanner;
// Left-Aligned Triangle Star Pattern
class Patt2{
    void Print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      Patt2 ob=new Patt2();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}