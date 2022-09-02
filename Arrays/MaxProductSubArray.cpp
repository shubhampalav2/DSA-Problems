class Solution {
    public int maxProduct(int[] nums) {
    int max=Integer.MIN_VALUE;
    //Brute Force Approach
    for(int i=0;i<nums.length;i++){
    int p=1;
    for(int j=0;j<nums.length;j++){
    p=p*nums[j];
    if(max<p){
    max=p;
    }
    }
    }
    return max;
    }
}
//Optimized Approach
class Solution2 {
public:
    int maxProduct(vector<int>& nums) {
     int ans=nums[0];
     int maxProd=ans;
     int minProd=ans;
    for(int i=1;i<nums.size();i++){
    //If Element is negative
    //Then swap max and min
    if(nums[i]<0){
    swap(maxProd,minProd);
    }
    maxProd=max(maxProd*nums[i],nums[i]);
    minProd=min(minProd*nums[i],nums[i]);
    ans=max(ans,maxProd);
    }
    return ans;
    }
};
