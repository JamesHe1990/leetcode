
public class WildcardMatching {
	public boolean isMatch(String s, String p) {
        int plenNoStar = 0;
        for (char c : p.toCharArray()){
            if (c != '*') plenNoStar++;
        }
        if (plenNoStar > s.length()) return false;

        s = " " + s;
        p = " " + p;
        int lth = s.length();
        int wth = p.length();
        if (lth == 0 && wth == 0) return true;
        if ((lth == 0 && plenNoStar != 0 || wth == 0) ) return false;
        boolean rst[][] = new boolean[lth][wth];
        // rst[0][0] = (s.charAt(0) == p.charAt(0)) || p.charAt(0) == '*' || p.charAt(0) == '?';
        rst[0][0] = true;
        for (int i =1; i < lth; i++){
            rst[i][0] = rst[i-1][0] && p.charAt(0) == '*';
        }
        for (int j = 1; j < wth; j++){
            rst[0][j] = rst[0][j-1] && p.charAt(j) == '*';
        }
        for(int i = 1; i < lth; i++){
            for (int j = 1; j < wth; j++){
                rst[i][j] = (rst[i-1][j-1] && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '*' || p.charAt(j) == '?')
                || (rst[i-1][j] && p.charAt(j) == '*')
                || (rst[i][j-1] && p.charAt(j) == '*'));
            }
        }
        return rst[lth-1][wth-1];
    }
}
