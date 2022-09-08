class MyStack {
 int arr[];
 int top;
 int size;
    public MyStack() {
    this.size=100;
    arr=new int[this.size];
    this.top=-1;
    }
    
    public void push(int x) {
     if(size-top>1){
    top++;
    arr[top]=x;
     }
    }
    
    public int pop() {
     if(top>=0){
    int ans=arr[top];
    top--;
    return ans;
     }
    else{
    return -1;
    }
    }
    
    public int top() {
     if(top==-1){
     return -1;
     }
    else{
    return arr[top];
    }
    }
    
    public boolean empty() {
     return top==-1;   
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
