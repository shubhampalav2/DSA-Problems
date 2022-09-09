class Solution {
    public void help(int i,int n,int k,List<Integer> list,List<List<Integer>> ans){
    //Base Case
    if(i>n){
    if(k==0){
    ans.add(new ArrayList<>(list));
    }
    return;
    }
    //exclude
    help(i+1,n,k,list,ans);
    //include
    list.add(i);
    help(i+1,n,k-1,list,ans);
    //backtrack
    list.remove(list.size()-1);
    }
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> ans=new ArrayList<>();
     List<Integer> list=new ArrayList<>();
     //We have to print the subsets from 1 to n
     help(1,n,k,list,ans);
     return ans;
    }
}
