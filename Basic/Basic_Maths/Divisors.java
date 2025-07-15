import java.util.*;

public class Divisors {

     public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
          int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
     }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Divisors ob = new Divisors();
        int[] result = ob.divisors(n);
        System.out.print("Divisors of " + n + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
