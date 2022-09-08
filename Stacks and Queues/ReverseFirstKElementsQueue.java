// User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<k;i++){
    stack.push(q.peek());
    q.remove();
    }
     //Pushing all the Elements into the queue
      // So our output becomes 4 5 3 2 1 
    while(!stack.isEmpty()){
    q.add(stack.peek());
    stack.pop();
    }
     // Now I will remove first n-k elements one by one and push at the end of the queue
    for(int i=0;i<q.size()-k;i++){
    int x=q.peek();
    q.remove();
    q.add(x);
    }
    return q;
    }
}
