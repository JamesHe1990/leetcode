import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MergeInterval {
	public List<Interval> merge(List<Interval> intervals) {
        ArrayList<Integer> itvPoints = new ArrayList<Integer>();
        ArrayList<Interval> rst = new ArrayList<Interval>();
        for (Interval interval : intervals){
            if (!itvPoints.contains(interval.start)) itvPoints.add(interval.start);
            if (!itvPoints.contains(interval.end)) itvPoints.add(interval.end);
        }
        Collections.sort(itvPoints);
        int itvRst[] = new int[itvPoints.size()];
        for (Interval interval : intervals) {
            int startIdx = itvPoints.indexOf(interval.start);
            int endIdx = itvPoints.indexOf(interval.end);
            for (int i = startIdx; i < endIdx; i++){
                itvRst[i] = 1;
            }
        }
        int startIdx = 0;
        for (int endIdx = 0; endIdx < itvRst.length; endIdx++){
            if (itvRst[endIdx] == 0 || endIdx == itvRst.length-1){
            	if (endIdx != startIdx) rst.add((new Interval(itvPoints.get(startIdx),itvPoints.get(endIdx))));
                startIdx = endIdx+1;
                continue;
            }
        }
        return rst;
    }
}
