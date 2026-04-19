class countSubsetSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        System.out.println(countSubsets(arr, sum));
    }

    private static int countSubsets(int[] wt, int sum) {
        int n = wt.length;
        int[][] t = new int[n + 1][sum + 1];
        for(int i = 0; i< n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j] = 0; // No subsets can be formed with 0 elements
                }
                if(j==0){
                    t[i][j] = 1; // There is one subset (the empty set) that sums to 0
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(wt[i-1] <= j) t[i][j] = t[i-1][j] + t[i-1][j-wt[i-1]];
                else t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
}
