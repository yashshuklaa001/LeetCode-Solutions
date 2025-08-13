// class Solution {
//     public void solve(char[][] board) {
//         int rows = board.length;
//         int cols = board[0].length;
//         boolean visited[][] = new boolean[rows][cols];

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(board[i][j]=='O'){
//                     dfs(i,j,board,visited);
//                 }
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(visited[i][j]==true){
//                     board[i][j]='O';
//                 }
//             }
//         }
//     }
//     public void dfs(int i,int j,char[][] board,boolean visited[][]){
//         if(i>0||i<board.length || j>0||j<board[0].length || i!=board.length-1 || j!=board[0].length || j==0 || i==0){
//             visited[i][j]=true;
//             return;
//         }
//         dfs(i-1,j,board,visited);
//         dfs(i+1,j,board,visited);
//         dfs(i,j-1,board,visited);
//         dfs(i,j+1,board,visited);
//     }
// }
class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean visited[][] = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(i, 0, board, visited);
            if (board[i][cols - 1] == 'O') dfs(i, cols - 1, board, visited);
        }
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(0, j, board, visited);
            if (board[rows - 1][j] == 'O') dfs(rows - 1, j, board, visited);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int i, int j, char[][] board, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (board[i][j] != 'O' || visited[i][j]) return;

        visited[i][j] = true;

        dfs(i - 1, j, board, visited);
        dfs(i + 1, j, board, visited);
        dfs(i, j - 1, board, visited);
        dfs(i, j + 1, board, visited);
    }
}
