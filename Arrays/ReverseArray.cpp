#include<iostream>
using namespace std;
int main(){
int arr[4]={1,2,3,4};
int s=0;
int e=3;
while(s<=e){
int t=arr[s];
arr[s]=arr[e];
arr[e]=t;
s++;
e--;
}
cout<<"Elements of Arrays after reversing is "<<endl;
for(int i=0;i<4;i++){
cout<<arr[i]<<" ";
}
return 0;
}
