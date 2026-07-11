import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> result) {
        // Base case: If we've selected k numbers, add a copy to results
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Optimization: i <= n - (k - temp.size()) + 1 ensures enough numbers remain
        for (int i = start; i <= n; i++) {
            temp.add(i); // Choose the number
            backtrack(i + 1, n, k, temp, result); // Recurse
            temp.remove(temp.size() - 1); // Backtrack
        }
    }

    // Main method to run and test the code
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4, k = 2;
        List<List<Integer>> combinations = sol.combine(n, k);
        
        System.out.println("Combinations for n=" + n + ", k=" + k + ":");
        System.out.println(combinations);
    }
}
