class Solution {
    public int findKthLargest(int[] nums, int k) {
    int c=1;
    int ans=-1;
    Arrays.sort(nums);
    for(int i=nums.length-1;i>=0;i--,c++){
    if(k==c){
    ans=nums[i];
    break;
    }
    }
    return ans;
    }
}
