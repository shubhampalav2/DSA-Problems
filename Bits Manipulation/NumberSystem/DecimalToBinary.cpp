#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the decimal number"<<endl;
    cin>>n;
    int ans=0;
    int i=0;
    while(n!=0){
    int bit=n&1;
    ans=ans+bit*pow(10,i);
    i++;
    n=n/2;
    }
    cout<<ans<<endl;
    return 0;
}
