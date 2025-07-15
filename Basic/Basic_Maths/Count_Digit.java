package Basic_Maths;

import java.util.Scanner;

public class Count_Digit {
        public int countDigit(int n) {
        int count =0;
          while(n>0){
            n=n/10;
            count=count+1;
          }
          return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for counting digit: ");
        int n=sc.nextInt();
        Count_Digit ob=new Count_Digit();
        ob.countDigit(n);
    }
}
