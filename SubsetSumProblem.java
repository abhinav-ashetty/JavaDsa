class SubsetSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;
        System.out.println(isSubsetSum(arr, sum));
    }

    private static boolean isSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i][j] = true; // Sum of 0 can always be achieved with an empty subset
                } else if (i == 0) {
                    dp[i][j] = false; // No elements to form a non-zero sum
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j]; // Exclude the current element
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]]; // Include or exclude the current element
                }
            }
        }

        return dp[n][sum];
    }
}