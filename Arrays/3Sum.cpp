vector<vector<int>> findTriplets(vector<int>nums, int n, int K) {
	// Write your code here.
   vector<vector<int>> ans;
      //Firstly I will sort the array
     sort(nums.begin(),nums.end());
    for(int i=0;i<n;i++){
    int a=nums[i];
    int t=K-a; //a+b+c=K then b+c=K-a
    //Two pointer approach
    if(i==0||i>0 &&(nums[i]!=nums[i-1])) //remove the elements within the loop
    {
    int s=i+1;
    int e=n-1;
    while(s<e){
    if(nums[s]+nums[e]==t){
    //For repeated elements
    while((nums[s]==nums[s+1])&&(s<e))
    s++;
     while((nums[e]==nums[e-1])&&(s<e))
     e--;
    
    ans.push_back({nums[i],nums[s],nums[e]});
    s++;
    e--;
    }
    if(nums[s]+nums[e]>t){
    e--;
    }
    if(nums[s]+nums[e]<t){
    s++;
    }
    }
   if(i+1<n&&(nums[i]==nums[i+1]))
        i++;
    }
    }
        return ans;
}
