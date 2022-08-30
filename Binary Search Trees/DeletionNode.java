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
//Deletion in BST
public static Node delete(Node root,int val){
if(root.data==val){
//case 1 child Node to delete
if(root.right==null && root.left==null){
return null;
}
// case 2 Node which has one child to delete
if(root.left==null){
return root.right;
}
if(root.right==null){
return root.left;
}
// case 3 Node which has two childrens
Node IS=inorderSuccessor(root.right);
root.data=IS.data;
root.right=delete(root.right,IS.data);
}
else if(val>root.data){
root.right=delete(root.right,val);
}
else{
root.left=delete(root.left,val);
}
return root;
}
public static Node inorderSuccessor(Node root){
while(root.left!=null){
root=root.left;
}
return root;
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
delete(root,5);
inorder(root);
} 
} 
