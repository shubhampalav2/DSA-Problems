//User function Template for Java
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        for(int i=0,c=1;i<arr.length;i++,c++){
        if(k==c){
        return arr[i];
        }
        }
        return -1;
    } 
}
