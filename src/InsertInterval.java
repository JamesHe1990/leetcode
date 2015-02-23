import java.util.List;


public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int i = intervals.size()-1;
        for (; i >= 0 ; i--){
            Interval curItv = intervals.get(i);
            if (curItv.start >  newInterval.end) continue;
            if (curItv.end <  newInterval.start){
                intervals.add(i+1, newInterval);
                break;
            }
            int start = Math.min(curItv.start,newInterval.start);
            int end = Math.min(curItv.end, newInterval.end);
            newInterval = new Interval(start,end);
            intervals.remove(i);
        }
        if (i == 0) intervals.add(0, newInterval);
        return intervals;
    }
}
