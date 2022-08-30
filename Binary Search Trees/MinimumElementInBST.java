class Tree {
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
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
    if(root==null){
    return -1;
    }
    inorder(root);
    return list.get(0);
    }
}
