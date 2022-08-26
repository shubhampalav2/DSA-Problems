class Solution {
public:
    int maxSubArray(vector<int>& nums) {
    int curSum=0;
    int maxSum=INT_MIN;
    for(int i=0;i<nums.size();i++){
    curSum+=nums[i];
    if(maxSum<curSum){
    maxSum=curSum;
    }
   // If Sum is negative then we need to ignore that curSum 
  // Assigns curSum as 0
  if(curSum<0){
  curSum=0;
  }
    }
return maxSum;
    }
};
