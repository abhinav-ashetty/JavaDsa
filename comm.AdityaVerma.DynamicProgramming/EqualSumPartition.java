public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int sum =0;
        for(int m : arr) sum += m;
        System.out.println(canPartition(arr,sum));
    }
    private static boolean canPartition(int[] arr, int sum ){
        int n = arr.length;
        
        if(sum % 2 != 0) return false; // If sum is odd, we cannot partition it into two equal subsets
        // Continue with the dynamic programming approach to find if a subset with the given sum exists
        int totalSum = sum / 2; // We only need to find one subset with sum equal to half of the total sum
        boolean[][] dp = new boolean[n + 1][totalSum + 1];
        // Initialize the dp array
        for(int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for(int j = 1; j <= totalSum; j++) {
            dp[0][j] = false;
        }
        // Fill the dp array
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= totalSum; j++) {
                if(arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][totalSum];
    }
}
