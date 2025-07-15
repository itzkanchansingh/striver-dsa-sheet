
import java.util.Scanner;

public class  Armstrong {

     public boolean isArmstrong(int n) {
        int res=0;
        int num=n;
        while(n!=0){
            int d=n%10;
            res=res+(d*d*d);
            n=n/10;
        }
        if(res==num)
           return true;
        else  
           return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for counting digit: ");
        int n=sc.nextInt();
        Armstrong ob=new Armstrong();
        System.out.println(ob.isArmstrong(n));
    }
}
