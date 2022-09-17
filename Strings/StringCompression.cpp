class Solution {
public:
    int compress(vector<char>& chars) {
     //For traversing given string from start to end
    int i=0;
    int ansIndex=0;
    int n=chars.size();
    while(i<n){
    int j=i+1;
    while(j<n && chars[i]==chars[j]){
    j++;
    }
    //We come out of these loop when traverse entire vector or
    //New/Different character is encounter
    int count=j-i;
    chars[ansIndex++]=chars[i];
    if(count>1){
    string str=to_string(count);
    for(char ch:str){
    chars[ansIndex++]=ch;
    }
    }
    //For next New Character
    i=j;
    }
    return ansIndex;
    }
};
