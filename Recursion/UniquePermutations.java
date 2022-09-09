class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    public void solve( List<List<Integer>> ans, List<Integer> list,int idx){
    //Base Case
    if(idx>=list.size()){
    //For finding Unique Permutations I am using set data structure
    if(set.add(list))
    ans.add(new ArrayList<>(list));
    return;
    }
    for(int i=idx;i<list.size();i++){
    Collections.swap(list,idx,i);
    solve(ans,list,idx+1);
    //backtrack
    Collections.swap(list,idx,i);
    }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
     List<Integer> list=new ArrayList<>();
    for(int x:nums){
    list.add(x);
    }
    solve(ans,list,0);
     return ans;
    }
}
