// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
bool PairSum(int arr[],int n,int k){
//Brute Approach O(n^2)
/*for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]+arr[j]==k){
return true;
}
}
}
return false;*/
//Optimized Approarch O(n)
 // Find the largest element
        int i;
        for (i = 0; i < n - 1; i++){
            if (arr[i] > arr[i + 1])
                break;
        }
        // l is now index of smallest element
        int l = (i + 1) % n;
  
        // r is now index of largest element
        int r = i;
  
        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == k)
                return true;
  
            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < k)
                l = (l + 1) % n;
  
            // Move to the lower sum side
            else  //arr[l] + arr[r] > k
                r = (n + r - 1) % n;
        }
        return false;
}
int main() {
int arr[6]={11, 15, 6, 8, 9, 10};
cout<<PairSum(arr,6,16)<<endl;
    return 0;
}
