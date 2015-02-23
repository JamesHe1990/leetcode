package sequence;

import java.util.HashMap;

public class Best_Time_to_Buy_and_Sell_Stock_III {
	public int maxProfit(int[] prices) {
		HashMap hs = new HashMap();
		
		int lth = prices.length;
		int leftMax[] = new int[lth];
		int rightMax[] = new int[lth];
		int maxProfit = 0;
		int min = prices[0];
		for (int i = 0; i < lth; i++){
			maxProfit = (prices[i] - min > maxProfit)? prices[i] - min: maxProfit;
			leftMax[i] = maxProfit;
			min = prices[i] < min ? prices[i] : min;
		}
		int max = prices[lth-1];
		maxProfit = 0;
		for (int i = lth-1; i >=0; i--){
			maxProfit = (max - prices[i] > maxProfit) ? max - prices[i] : maxProfit;
			rightMax[i] = maxProfit;
			max = prices[i] > max ? prices[i]:max;
		}
		int totalMax = 0;
		for (int i = 0; i < lth; i++){
			totalMax = Math.max(totalMax, leftMax[i]+rightMax[i]);
		}
		return totalMax;
	}
}
