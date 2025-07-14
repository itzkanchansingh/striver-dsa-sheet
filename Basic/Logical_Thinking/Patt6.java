import java.util.Scanner;
// 
public class Patt6 {
    void Print(int n){
       for(int i=1;i<=n;i++){
        for(int j=1;j<=(n+1)-i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Patt6 ob=new Patt6();
        ob.Print(n);
    }
}
