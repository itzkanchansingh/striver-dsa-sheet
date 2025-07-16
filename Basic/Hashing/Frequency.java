import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Frequency {
    static void frequency(int[] a,int n){
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(a[i])){
              mp.put(a[i],mp.get(a[i])+1);
            }
            else{
                mp.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()) {
            System.out.println(e.getKey()+""+e.getValue());
            
        }
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the values for an Array:");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("So the values of an Array are :");
         for(int i=0;i<n;i++){
          System.out.println(arr[i]);
        }
        frequency(arr,n);
        
    }
}
