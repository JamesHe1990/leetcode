package dp;

public class MinPath {
	public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int leng1 = grid.length;
        int leng2 = grid[0].length;
        int rst[][] = new int[leng1][leng2];
        rst[0][0] = grid[0][0];
        for (int i = 1; i < leng1; i++) {
            rst[i][0] = rst[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < leng2; j++) {
            rst[0][j] = rst[0][j-1] + grid[0][j];
        }
        for (int i = 1; i < leng1; i++) {
            for (int j = 1; j < leng2; j++) {
                rst[i][j] = Math.min(rst[i-1][j], rst[i][j-1]) + grid[i][j];
            }
        }
        return rst[leng1-1][leng2-1];
    }
}
