class Solution
{
    ArrayList<Integer> list=new ArrayList<>();
    public void inorder(Node root){
    //Base Case
    if(root==null){
    return;
    }
    inorder(root.left);
    list.add(root.data);
    inorder(root.right);
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int k)
    {
        //Your code here
        inorder(root);
        int c=1;
        int i;
        for(i=list.size()-1;i>=0;c++,i--){
        if(c==k){
        break;
        }
        }
        return list.get(i);
    }
}
