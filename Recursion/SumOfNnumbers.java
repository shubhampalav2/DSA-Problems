import java.util.*;
class Number{
 public static int SumN(int n){
 //Base Case
 if(n==1){
 }
 //Recursive call
  return 1;
 return (n+SumN(n-1));
 }
 public static void main(String []args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int sum=0;
 sum=SumN(n);
 System.out.println("Sum of first "+n+"numbers is "+sum);
 }
}
