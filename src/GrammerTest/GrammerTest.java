package GrammerTest;

import java.util.ArrayList;
import java.util.Arrays;

public class GrammerTest {
	public int sqrt(int x) {
        long end = (long)x;
        long start = 0;
        long mid = 0;
        while(end > start){
            mid = end + (end-start)/2;
            if ((long)x == mid*mid) return (int) mid;
            if ((long)x > mid*mid){
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
