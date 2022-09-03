import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count[]=new int[26];
String str="teststring";
HashMap<Integer,Character> map=new HashMap<>();
 for(int i=0;i<str.length();i++){
 count[str.charAt(i)-'a']++;
 map.put(count[str.charAt(i)-'a'],str.charAt(i));
}
for(int i=0;i<count.length;i++){
 if(count[i]>1){
 System.out.println(map.get(count[i])+" "+count[i]);
 }
}
	}
}
