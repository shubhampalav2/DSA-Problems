//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static boolean isSafe(int m[][],boolean visited[][],int x,int y,int n){
    if((x>=0&&x<n)&&(y>=0&&y<n)&& m[x][y]==1 && visited[x][y]==false){
    return true;
    }
    return false;
    }
    public static void solve(int m[][],boolean visited[][],int n,String path,int x,int y,ArrayList<String> ans){
    //Base Case
    if(x==n-1 && y==n-1){
    ans.add(path);
    return;
    }
    visited[x][y]=true;
    //4 choices
    //Down
    int newx=x+1,newy=y;
    if(isSafe(m,visited,newx,newy,n)){
    solve(m,visited,n,path+'D',newx,newy,ans);
    }
    //Left
    newx=x;
    newy=y-1;
    if(isSafe(m,visited,newx,newy,n)){
    solve(m,visited,n,path+'L',newx,newy,ans);
    }
    //Right
    newx=x;
    newy=y+1;
    if(isSafe(m,visited,newx,newy,n)){
    solve(m,visited,n,path+'R',newx,newy,ans);
    }
    //Up
    newx=x-1;
    newy=y;
    if(isSafe(m,visited,newx,newy,n)){
    solve(m,visited,n,path+'U',newx,newy,ans);
    }
    visited[x][y]=false;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
    ArrayList<String> ans=new ArrayList<>();
    if(m[0][0]==0){
    return ans;
    }
    boolean visited[][]=new boolean[n][n];
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    visited[i][j]=false;
    }
    }
    solve(m,visited,n,"",0,0,ans);
    return ans;
    }
}
