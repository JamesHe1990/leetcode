package dp;

public class UniquePathTwo {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        int leng = obstacleGrid.length;
        int wid = obstacleGrid[0].length;
        int rst[][] = new int[leng][wid];
        rst[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 1; i < leng; i++) {
            rst[i][0] = obstacleGrid[i][0] == 1 ? 0 :rst[i-1][0];
        }
        for (int j = 1; j < wid; j++) {
            rst[0][j] = obstacleGrid[0][j] == 1 ? 0 :rst[0][j-1];
        }
        for (int i = 1; i < leng; i++) {
            for (int j = 1; j < wid; j++) {
                rst[i][j] = obstacleGrid[i][j] == 1 ? 0 : (rst[i-1][j] + rst[i][j-1]);
            }
        }
        return rst[leng-1][wid-1];
    }
}
