class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()==t.length()){
    int c=0;
    for(int i=0;i<s.length();i++){
    for(int j=0;j<t.length();j++){
    if(s.charAt(i)==t.charAt(j)){
    c=c+1;
    break;
    }
    }
    }
        System.out.println(c);
    if(c==s.length()){
    return true;
    }
    else{
    return false;
    }
    }
    else{
    return false;
    }
    }
}
