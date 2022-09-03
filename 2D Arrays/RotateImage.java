class Solution {
    public void rotate(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
    for(int j=i;j<matrix[0].length;j++){
    int t=matrix[i][j];
    matrix[i][j]=matrix[j][i];
    matrix[j][i]=t;
    }
    }
    for(int i=0;i<matrix.length;i++){
    int s=0,e=matrix[0].length-1;
    while(s<=e){
    int t=matrix[i][s];
    matrix[i][s]=matrix[i][e];
    matrix[i][e]=t;
    s++;
    e--;
    }
    }
     }
}
