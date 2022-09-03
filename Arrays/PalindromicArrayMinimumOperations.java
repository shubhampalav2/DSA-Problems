import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	int i=0,j=n-1;
	int ans=0;
	while(i<=j){
	//There is no operation required to perform
	if(arr[i]==arr[j]){
	i++;
	j--;
	}
	//Here we need to merge adjacent elements as single element
	else if(arr[i]<arr[j]){
	i++;
	arr[i]=arr[i]+arr[i-1];
	ans=ans+1;
	}
	//arr[j]<arr[i]
	else{
	j--;
	arr[j]=arr[j]+arr[j+1];
	ans=ans+1;
	}
	}
	System.out.println(ans);
	}
}
