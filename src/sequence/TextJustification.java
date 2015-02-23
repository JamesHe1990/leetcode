package sequence;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	public List<String> fullJustify(String[] words, int L) {
        ArrayList<String>rst = new ArrayList<String>();
        for (String word : words) {
            if (word.length() > L) return rst;
        }
        
        String blanks[] = new String[L+1];
        blanks[0] = "";
        for(int i = 1; i <= L; i++){
            blanks[i] = blanks[i-1]+" ";
        }
        ArrayList<String> tmp = new ArrayList<String>();
        int space = 0;
        int j = 0;
        while(j < words.length){
            String word = words[j];
            if (space + word.length() > L){
                String line = "";
                if (tmp.size() == 1) {
                    line = tmp.get(0) + blanks[L-tmp.get(0).length()];
                    rst.add(line);
                } else {
                    int interval = (L-space+tmp.size())/(tmp.size()-1);
                    for (int i = 0; i < tmp.size()-1; i++){
                        line += (tmp.get(i)+blanks[interval]);
                    }
                    if (tmp.size() != 0){
                        String last = tmp.get(tmp.size()-1);
                        line += (blanks[L-line.length()-last.length()] + last);
                    }
                    rst.add(line);
                }
                space = 0;
                tmp = new ArrayList<String>();
            } else{
                tmp.add(word);
                if(j == words.length-1){
                    String line = "";
                    for (String lastWord : tmp) line += (lastWord + " ");
                    rst.add(line + blanks[L-line.length()]);
                    j++;
                } else{
                    space += word.length() + 1;
                    j++;
                }
            }
        }
        return rst;
    }
}
