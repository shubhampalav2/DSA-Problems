class Solution {
    public int[] productExceptSelf(int[] nums) {
    int ans[]=new int[nums.length];
    //Native Approach or Brute Force Approach
    for(int i=0;i<nums.length;i++){
    int p=1;
    for(int j=0;j<nums.length;j++){
    if(i!=j){
    p=p*nums[j];
     }
    }
    ans[i]=p;
      }
    //Optimized Approach
    //Finding Left product of elements
     ans[0]=1;
     for(int i=1;i<nums.length;i++){
     ans[i]=ans[i-1]*nums[i-1];
     }
    //Finding right product of elements
    int p=1;
    for(int i=nums.length-2;i>=0;i--){
    ans[i]=ans[i]*nums[i+1]*p;
    p=p*nums[i+1];
    }
 return ans;
    }
}
