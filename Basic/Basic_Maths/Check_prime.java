import java.util.Scanner;
public class Check_prime {

     public boolean isPrime(int n) {
          //your code goes here
          for(int i=2;i<=n-1;i++){
            if(n%i==0)
              return false;
          }
          return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        Check_prime ob=new Check_prime();
        System.out.println(ob.isPrime(n));
    }
}
