// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
       int ans=0;
       while(N!=0){
       //If number is odd then the bit is 1
       if(N%2!=0){
       ans+=1;
       }
       N=N/2;
       }
       return ans;
    }
}
