class Solution {
    public int f(int n,int dp[]){
      //Base Case
    if(n==0){
    return 0;
    }
    if(n==1){
    return 1;
    }
    if(dp[n]!=-1){
    return dp[n];
    }
    dp[n]=f(n-1,dp)+f(n-2,dp);
    return dp[n];   
    }
    public int fib(int n) {
    int dp[]=new int[31];
    Arrays.fill(dp,-1);
    return f(n,dp);
    }
}
