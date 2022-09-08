/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
     // Checking if Empty space is there to insert
     if(sq.size-sq.top1>1){
      sq.top1++;
      sq.arr[sq.top1]=x;
     }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
    if(sq.top2-sq.top1>1){
    sq.top2--;
    sq.arr[sq.top2]=x;
    }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
    if(sq.top1>=0){
    int ans=sq.arr[sq.top1];
    sq.top1--;
    return ans;
    }
    else{
    //If Integer is there to remove
    //Stack 1 is empty
    return -1;
    }
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
     if(sq.top2<sq.size){
     int ans=sq.arr[sq.top2];
     sq.top2++;
     return ans;
     }
     else{
    return -1;
     }
    }
}
