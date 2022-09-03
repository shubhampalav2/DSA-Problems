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
