class Solution {
    public boolean check(int count1[],int count2[]){
    for(int i=0;i<26;i++){
    if(count1[i]!=count2[i]){
    return false;
    }
    }
    return true;
    }
    public boolean checkInclusion(String s1, String s2) {
    //For first string
    int count1[]=new int[26];
    //For second string
    int count2[]=new int[26];
    for(int i=0;i<26;i++){
    count1[i]=0;
    count2[i]=0;
    }
    //Store the count of s1 into count1
    for(int i=0;i<s1.length();i++){
    count1[s1.charAt(i)-'a']++;
    }
    //Window Size
    int k=s1.length();
    //Traverse s2 in window size of s1
    int i=0;
    while(i<k && i<s2.length()){
    count2[s2.charAt(i)-'a']++;
    i++;
    }
    //Now Compare count1 and count2
    if(check(count1,count2))
    return true;
    //If not equal then do next window processing
    //Slide the window
    while(i<s2.length()){
    count2[s2.charAt(i)-'a']++;
    //remove the old char
    count2[s2.charAt(i-k)-'a']--;
    //Now Compare count1 and count2
    if(check(count1,count2))
    return true;
    i++;
    }
    return false;
    }
}
