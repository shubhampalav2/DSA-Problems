class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public void inorder(TreeNode root){
    //Base Case
    if(root==null){
    return;
    }
    inorder(root.left);
    list.add(root.val);
    inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
    inorder(root);
    int i,c=1;
     for(i=0;i<list.size();i++,c++){
     if(k==c){
     break;
     }
     }
     return list.get(i);
    }
}
