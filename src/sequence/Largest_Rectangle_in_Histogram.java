package sequence;

public class Largest_Rectangle_in_Histogram {
	public int largestRectangleArea(int[] height) {
        if (height.length == 0) return 0;
        int maxIdx = 0;
        for (int i = 0; i < height.length; i++){
            if (height[maxIdx] < height[i]) maxIdx = i;
        }
        int startIdx = maxIdx;
        int endIdx = maxIdx;
        int maxArea = 0;
        int minHeight = height[maxIdx];
        while(startIdx != 0 || endIdx != height.length-1) {
            maxArea = Math.max(maxArea, (endIdx - startIdx+1)*minHeight);
            if (startIdx == 0){
                endIdx++;
                minHeight = Math.min(minHeight, height[endIdx]);
            } else if(endIdx == height.length-1){
                startIdx--;
                minHeight = Math.min(minHeight, height[startIdx]);
            } else{
                if (height[startIdx-1] >= height[endIdx+1]){
                    startIdx--;
                    minHeight = Math.min(minHeight, height[startIdx]);
                } else {
                    endIdx++;
                    minHeight = Math.min(minHeight, height[endIdx]);
                }
            }
        }
        maxArea = Math.max(maxArea, (endIdx - startIdx+1)*minHeight);
        return maxArea;
    }
}
