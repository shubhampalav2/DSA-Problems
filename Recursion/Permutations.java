class Solution {
    public void solve(List<List<Integer>> ans,int nums[],int idx, ArrayList<Integer> list){
    //Base Case
    if(idx>=nums.length){
    ans.add(new ArrayList<>(list));
    return;
    }
    for(int i=idx;i<nums.length;i++){
    Collections.swap(list,idx,i);
    solve(ans,nums,idx+1,list);
    //backtrack
    Collections.swap(list,idx,i);
    }
    }
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    for(int x:nums){
    list.add(x);
    }
     solve(ans,nums,0,list);
    return ans;
    }
}
