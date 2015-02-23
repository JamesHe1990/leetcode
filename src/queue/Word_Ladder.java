package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Set;

public class Word_Ladder {
	public int ladderLength(String start, String end, Set<String> dict) {
		int curLayer = 1;
		int nextLayer = 0;
		int layerNum = 0;
        Queue<String> q = new ArrayDeque<String>();
        q.add(start);
        while(!q.isEmpty()){
        	String word = q.remove();
        	if (word == end) return layerNum;
        	ArrayList<String> words = findWord(word, dict);
        	for (String myWord : words) 
        		q.add(myWord);
        	curLayer--;
        	nextLayer += words.size();
        	if(curLayer == 0) {
        		curLayer = nextLayer;
        		nextLayer = 0;
        		layerNum++;
        	}
        }
        return 0;
    }
	
	public ArrayList<String> findWord(String start, Set<String> dict) {
		ArrayList<String> wordList = new ArrayList<String>();
		for(String word: dict) {
			if (transform(start,word)) wordList.add(word);
		}
		return wordList;
	}
	public boolean transform(String first, String second) {
		if (first.length() != second.length()) return false;
		for (int i = 0; i < first.length() - 1; i++) {
			String firstTrim = first.substring(0, i) + first.substring(i+1);
			String secondTrim = second.subSequence(0, i) + second.substring(i+1);
			if (firstTrim.equals(secondTrim)) return true;
		}
		if(first.subSequence(0, first.length()-1).equals(second.subSequence(0, second.length()-1))) return true;
		return false;
	}
}
