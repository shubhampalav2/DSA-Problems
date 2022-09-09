class Solution {
    public static boolean isSafe(List<List<String>> allboards, char boards[][],int row,int col){
    //horizontally
    for(int i=0;i<boards.length;i++){
    if(boards[row][i]=='Q'){
    return false;
    }
    }
    //vertically
    for(int i=0;i<boards.length;i++){
    if(boards[i][col]=='Q'){
    return false;
    }
    }
    //upper left
    int c=col;
    for(int i=row;i>=0&&c>=0;i--,c--){
    if(boards[i][c]=='Q'){
    return false;
    }
    }
    //upper right
     c=col;
    for(int r=row;r>=0&&c<boards.length;r--,c++){
    if(boards[r][c]=='Q'){
    return false;
    }
    }
    //lower left
     c=col;
    for(int r=row;r<boards.length&&c>=0;c--,r++){
    if(boards[r][c]=='Q'){
    return false;
    }
    }
    //lower right
    c=col;
    for(int r=row;r<boards.length&&c<boards.length;c++,r++){
    if(boards[r][c]=='Q'){
    return false;
    }
    }
    return true;
    }
    public static void save(List<List<String>> allBoards, char board[][]){
    String row = "";
   List<String> newBoard = new ArrayList<>();
    for(int i=0; i<board.length; i++) {
    row = "";
for(int j=0; j<board[0].length; j++) {
if(board[i][j] == 'Q')
row += 'Q';
else
row += '.';
}
newBoard.add(row);
}
allBoards.add(newBoard);

    }
    public static void help(List<List<String>> allboards, char boards[][],int n,int col){
    //Base Case
    if(col==n){
    save(allboards,boards);
    return;
    }
    for(int row=0;row<n;row++){
    if(isSafe(allboards,boards,row,col)){
    boards[row][col]='Q';
    help(allboards,boards,n,col+1);
    boards[row][col]='.';
    }
    }
    }
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> allboards=new ArrayList<>();
     char boards[][]=new char[n][n];
     help(allboards,boards,n,0);
    return allboards;
    }
}
