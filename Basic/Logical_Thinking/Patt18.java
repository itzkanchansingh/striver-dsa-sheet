import java.util.Scanner;
class Patt18{
 void Print(int n ){
       for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=i;j<=n;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
      Patt18 ob=new Patt18();
      Scanner sc=new Scanner(System.in);
       int nu=sc.nextInt();
       ob.Print(nu);

    }
}