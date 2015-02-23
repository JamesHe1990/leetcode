package recursive;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return true;
        if (board.length == 0 || board[0].length == 0) return false;
        int leng = board.length;
        int wid = board[0].length;
        int visited[][] = new int[leng][wid];
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < wid; j++){
                visited[i][j] = 0;
            }
        }
        boolean flag = false;
         for (int i = 0; i < leng; i++) {
            for (int j = 0; j < wid; j++){
                visited[i][j] = 1;
                if (word.charAt(0) == board[i][j]) flag = flag || existHelper(board,word,visited,i,j,1);
                visited[i][j] = 0;
            }
        }
        return flag;
    }
    
    public boolean existHelper(char[][]board, String word, int[][]visited, int i, int j, int curLeng){
        if (curLeng == word.length()) return true;
        boolean flag = false;
        if(i > 0 && visited[i-1][j] == 0 && board[i-1][j] == word.charAt(curLeng)){
            visited[i-1][j] = 1;
            flag = flag || existHelper(board,word,visited,i-1,j,curLeng+1);
            visited[i-1][j] = 0;
        }
        if(j > 0 && visited[i][j-1] == 0 && board[i][j-1] == word.charAt(curLeng)){
            visited[i][j-1] = 1;
            flag = flag || existHelper(board,word,visited,i,j-1,curLeng+1);
            visited[i][j-1] = 0;
        }
        if(i < board.length-1 && visited[i+1][j] == 0 && board[i+1][j] == word.charAt(curLeng)){
            visited[i+1][j] = 1;
            flag = flag || existHelper(board,word,visited,i+1,j,curLeng+1);
            visited[i+1][j] = 0;
        }
        if(j < board[0].length-1 && visited[i][j+1] == 0 && board[i][j+1] == word.charAt(curLeng)){
            visited[i][j+1] = 1;
            flag = flag || existHelper(board,word,visited,i,j+1,curLeng+1);
            visited[i][j+1] = 0;
        }
        return flag;
    }
}
