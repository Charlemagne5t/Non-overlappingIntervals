import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]).thenComparing(a -> a[1]));
        Map<String, Integer> memo = new HashMap<>();
        return dfs(intervals, 0, Integer.MIN_VALUE, memo);
    }

    public int dfs(int[][] intervals, int i, int rightBoundary, Map<String, Integer> memo) {
        if(memo.containsKey(i + " " + rightBoundary)){
            return memo.get(i + " " + rightBoundary);
        }
        if (i == intervals.length) {
            return 0;
        }

        int result = 0;
        int include = Integer.MAX_VALUE;
        if (intervals[i][0] >= rightBoundary) {
            include = dfs(intervals, i + 1, intervals[i][1], memo);
        }
        int skip = 1 + dfs(intervals, i + 1, rightBoundary, memo);

        result = Math.min(include, skip);
        memo.put(i + " " + rightBoundary, result);

        return result;

    }
}
