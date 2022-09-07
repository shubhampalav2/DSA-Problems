#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int a;
    cout<<"Enter the binary number"<<endl;
    cin>>a;
    int ans=0;
    int i=0;
    while(a!=0){
    int bit=a%10;
    if(bit==1){
    ans+=bit*pow(2,i);
    }
    i++;
    a=a/10;
    }
    cout<<ans<<endl;
    return 0;
}
