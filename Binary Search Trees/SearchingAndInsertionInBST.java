class BST{
static class Node{
int data;
Node left;
Node right;
Node(int data){
this.data=data;
this.left=null;
this.right=null;
}
}
public static Node insertNode(Node root,int val){
//Base Case
if(root==null){
root=new Node(val);
return root;
}
if(val<=root.data){
//Left subtree
root.left=insertNode(root.left,val);
}
else{
//Right subtree
root.right=insertNode(root.right,val);
}
return root;
}
//Inorder Traversal
public static void inorder(Node root){
//Base Case
if(root==null){
return;
}
//Recursive call for left subtree
inorder(root.left);
System.out.print(root.data+" ");
//Recursive call for right subtree
inorder(root.right);
}
//Searching in BST
public static boolean Search(Node root,int key){
if(root==null){
return false;
}
if(root.data==key){
return true;
}
else if(key<root.data){
return Search(root.left, key);
}
else{
return Search(root.right, key);
}
}
public static void main(String []args){
int values[]={5,1,3,4,2,7};
Node root=null;
for(int i=0;i<values.length;i++){
root=insertNode(root,values[i]);
}
System.out.println("Root Node is "+root.data);
inorder(root);
System.out.println("\n"+Search(root,14));
} 
} 
