
--------------------------------------
class LongestIncreasingSubsequence {
    static int lis(int arr[]) {
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max_val=0;
        for(int i=0;i<n;i++){
            max_val=Math.max(max_val,dp[i]);
        }
        return max_val;
    }
}

