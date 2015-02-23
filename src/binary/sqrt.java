package binary;

public class sqrt {
	public int sqrt(int x) {//这个找下限
        long start = 0;
        long end = x;
        while(start <= end) {
            //if (start+1 == end) return end*end == (long)x ? (int)end : (int)start;
            long mid = start + (end-start)/2;
            if(mid*mid == x) return (int)mid;
            if (mid*mid > x){
            	end = mid-1;
            } else{
            	start = mid+1;
            }
        }
        return (int)end ;  //规律，最终要上限，就返回start，要下限就返回end
    }
	
	public int sqrt2(int x) {//这个找上限
        long start = 0;
        long end = x;
        while(start <= end) {
            //if (start+1 == end) return end*end == (long)x ? (int)end : (int)start;
            long mid = start + (end-start)/2;
            //if(mid*mid == x) return (int)mid;
            if (mid*mid > x){
            	end = mid-1;
            } else{
            	start = mid+1;
            }
        }
        return (int)start ;  //规律，最终要上限，就返回start，要下限就返回end
    }
	
	public int sqrt1(int x) {
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
        return (int)mid;
    }
}
