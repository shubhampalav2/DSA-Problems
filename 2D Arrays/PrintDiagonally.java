
//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int A[][])
    {
     // code here 
     ArrayList<Integer> list=new ArrayList<>();
     for(int col=0;col<n;col++){
     int i=col;
     int j=0;
     while(i>=0){
     list.add(A[j][i]);
     i--;
     j++;
     }
     }
     for(int row=1;row<n;row++){
     int i=row;
     int j=n-1;
     while(i<n){
     list.add(A[i][j]);
     i++;
     j--;
     }
     }
     
     return list;
    }
}
