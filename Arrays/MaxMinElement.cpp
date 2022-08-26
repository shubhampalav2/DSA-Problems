#include <iostream>
using namespace std;
int getMax(int arr[],int n){
int maxi=arr[0];
for(int i=1;i<n;i++){
maxi=max(maxi,arr[i]);
}
return maxi;
}
int getMin(int arr[],int n){
int min=arr[0];
for(int i=0;i<n;i++){
if(min>arr[i]){
min=arr[i];
}
}
return min;
}
int main()
{
int arr[4]={106,22,38,140};
cout<<"Minimum Element in an Array is "<<getMin(arr,4)<<endl;
cout<<"Maximum Element in an Array is "<<getMax(arr,4)<<endl;
return 0;
}
