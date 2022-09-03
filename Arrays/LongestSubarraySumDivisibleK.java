//Brute Force O(n^2)
class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
    int sum=0;
    int ans=0;
    int s=0;
    int e=0;
    for(int i=0;i<a.length;i++){
    sum=0;
    s=i;
    for(int j=i;j<a.length;j++){
    sum+=a[j];
    if(sum%k==0){
    e=j;
    ans=Math.max(ans,e-s+1);
    }
    }
 
     }
     return ans;  
    }
 
}
//Optimized Approach Time Complexity:O(n)
//Space Complexity:O(n)
//Using Hashing(HashMaps)

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
    int sum=0;
    int ans=0;
    int rem=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    //Inserting rem and index in the map
    map.put(0,-1);
    for(int i=0;i<n;i++){
    sum+=a[i];
    rem=sum%k;
    if(rem<0){
    rem+=k;
    }
    if(map.containsKey(rem)){
    int idx=map.get(rem);
    int result=i-idx;
    ans=Math.max(ans,result);
    }
    else{
    map.put(rem,i);
    }
    }
     return ans;  
    }
 
}
