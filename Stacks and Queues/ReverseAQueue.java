//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
    Queue<Integer> q1=new LinkedList<>();
    Stack<Integer> s1=new Stack<>();
    while(!q.isEmpty()){
    s1.push(q.peek());
    q.remove();
    }
    while(!s1.isEmpty()){
    q1.add(s1.peek());
    s1.pop();
    }
    return q1;
    }
}
