package dp;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return true;
        if (board.length == 0 || board[0].length == 0) return false;
        int m = board.length;
        int n = board[0].length;
        boolean flag = false;
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == word.charAt(0)){
                    flag = existHelper(board,word,i,j,0);
                    if (flag == true) return true;
                }
            }
        }
        return false;
    }
    public boolean existHelper(char[][]board,String word,int row, int col, int startPos){
        if (startPos == word.length()-1) return true;
        int m = board.length;
        int n = board[0].length;
        char tmp = board[row][col];
        board[row][col] = '*';
        boolean flag = false;
        System.out.println(board[row][col+1]);
    	System.out.println(word.charAt(startPos)+1);
        if (row < m-1 && board[row+1][col] == word.charAt(startPos)+1) 
        	flag = flag || existHelper(board,word,row+1,col,startPos+1);
        if (row > 0 && board[row-1][col] == word.charAt(startPos)+1) 
        	flag = flag || existHelper(board,word,row-1,col,startPos+1);
        if (col < n-1 && board[row][col+1] == word.charAt(startPos)+1){
        	
        	flag = flag || existHelper(board,word,row,col+1,startPos+1);
        }
        if (col > 0 && board[row][col-1] == word.charAt(startPos)+1) 
        	flag = flag ||existHelper(board,word,row,col-1,startPos+1);
        board[row][col] = tmp;
        return flag;
    }
}
