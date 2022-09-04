import java.util.*;
public class Main
{
 public static boolean Palindrome(String str,int s,int e){
 //Base Case
 if(s>e){
  return true;
 }
 if(str.charAt(s)!=str.charAt(e)){
return false;
 }
 else{
 //Recursive call
 return Palindrome(str,s+1,e-1);
 }
 }
 public static void main(String []args){
 Scanner sc=new Scanner(System.in);
 String str=sc.next();
 System.out.println(Palindrome(str,0,str.length()-1));
 
}
}
