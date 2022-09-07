#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number"<<endl;
    cin>>n;
    int m=n;
    int mask=0;
    while(m!=0){
    mask=mask<<1|1;
    m=m/2;
    }
    int ans=(~n)&mask;
    cout<<"The one's complement of a number is "<<ans<<endl;
    return 0;
}
