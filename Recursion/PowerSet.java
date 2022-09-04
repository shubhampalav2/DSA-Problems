import java.util.*;
public class Main
{
 public static void PowerSet(int arr[],int i,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> output){
 //Base Case
if(i>=arr.length){
output.add(new ArrayList<>(list));
return;
}
//exclude
PowerSet(arr,i+1,list,output);
//include
list.add(arr[i]);
PowerSet(arr,i+1,list,output);
//backtrack
list.remove(list.size()-1);
 }
 public static void main(String []args){
int arr[]={1,2,3};
ArrayList<Integer> list=new ArrayList<>();
ArrayList<ArrayList<Integer>> output=new ArrayList<>();
PowerSet(arr,0,list,output);
for(ArrayList<Integer> x:output){
System.out.print(x+" ");
}
}
}
//Time Complexity O(2^n)
