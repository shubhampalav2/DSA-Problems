class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> list=new ArrayList<>();
     int row=matrix.length;
     int col=matrix[0].length;
     int n=row*col;
     int startRow=0;
     int startCol=0;
     int endCol=col-1;
     int endRow=row-1;
     int c=0;
     while(c<n){
     for(int i=startCol;i<=endCol && c<n;i++){
     list.add(matrix[startRow][i]);
     c=c+1;
     }
     startRow++;
     for(int i=startRow;i<=endRow && c<=n;i++){
     list.add(matrix[i][endCol]);
     c=c+1;
     }
     endCol--;
     for(int i=endCol;i>=startCol && c<n;i--){
     list.add(matrix[endRow][i]);
     c++;
     }
     endRow--;
     for(int i=endRow;i>=startRow && c<n;i--){
     list.add(matrix[i][startCol]);
     c++;
     }
     startCol++;
     }
    return list;
    }
}
