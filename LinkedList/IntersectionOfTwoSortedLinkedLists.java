class Solution
{
   public static Node findIntersection(Node l1, Node l2)
    {
        // code here.
    Node ans=new Node(-1);
    Node temp=ans;
    
    while(l1!=null && l2!=null){

    if(l1.data==l2.data){
    temp.next=l1;
    temp=temp.next;
    l1=l1.next;
    l2=l2.next;
    }
    else if(l1.data<l2.data){
    l1=l1.next;
    }
    else{
    //l2.data<l1.data
    l2=l2.next;
    }
    }
    temp.next=null;
    return ans.next;
    }
}
