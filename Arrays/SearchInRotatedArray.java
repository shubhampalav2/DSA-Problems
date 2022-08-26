class SearchInRotatedArray {
    public static int getPivot(int nums[],int k){
    int s=0;
    int e=nums.length-1;
    while(s<e){
    int mid=s+(e-s)/2;
    if(nums[mid]>=nums[0]){
    s=mid+1;
    }
    else{
    e=mid; 
    }
    }
   return e;
    }
    public static int BinarySearch(int a[],int s,int e,int k){
    while(s<=e){
    int mid=s+(e-s)/2;
    if(a[mid]==k){
    return mid;
    }
    else if(a[mid]<k){
    s=mid+1;
    }
    else{
    e=mid-1;
    }
    }
    return -1;
    }
    public int search(int[] nums, int k) {
     int p=getPivot(nums,k);
     int e=nums.length-1;
    if(nums.length>1){
     if(k<=nums[0] && k>=nums[p-1]){
     return BinarySearch(nums,0,p-1,k);
     }
    else{
    return BinarySearch(nums,p,e,k);
    }
    }
    else{
    return BinarySearch(nums,0,0,k);
    }
}
}
