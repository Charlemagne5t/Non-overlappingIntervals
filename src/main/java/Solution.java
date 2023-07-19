import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));

        int rightBoundary = intervals[0][1];
        int removed = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < rightBoundary){
                removed++;
            }else{
                rightBoundary = intervals[i][1];
            }
        }

        return removed;
    }

}
