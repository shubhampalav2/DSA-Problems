class Solution {
    public int findMin(int[] nums) {
    int mini=nums[0];
    for(int i=1;i<nums.length;i++){
    mini=Math.min(mini,nums[i]);
    }
    return mini;
    }
}
