import java.util.ArrayList;
public class Program {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        int currentSum = 0;

        while (end < n) {
            currentSum += arr[end];

            while (currentSum > s) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == s) {
                result.add(start + 1); // 1-based indexing
                result.add(end + 1);   // 1-based indexing
                return result;
            }

            end++;
        }

        result.add(-1); // No such subarray found
        return result;
    }
    public static void main(String[] args) {
        
    }
}

