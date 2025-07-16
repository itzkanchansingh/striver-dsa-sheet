import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hashing{
     public static List<Integer> print(int[] arr, int[] queries) {
        // Step 1: Build frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Process each query
        List<Integer> result = new ArrayList<>();
        for (int q : queries) {
            result.add(freqMap.getOrDefault(q, 0));
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int[] queries = {1, 3, 4, 2, 10};

        List<Integer> output = print(arr, queries);

        // Print the results
        for (int i = 0; i < queries.length; i++) {
            System.out.println("Frequency of " + queries[i] + " is: " + output.get(i));
        }
    }
}