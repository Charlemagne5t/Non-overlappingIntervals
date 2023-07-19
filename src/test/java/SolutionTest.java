import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void eraseOverlapIntervalsTest1(){
        int[][] intervals = {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };
        int expected = 1;
        int actual = new Solution().eraseOverlapIntervals(intervals);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void eraseOverlapIntervalsTest2(){
        int[][] intervals = {
                {1,2},
                {1,2},
                {1,2}
        };
        int expected = 2;
        int actual = new Solution().eraseOverlapIntervals(intervals);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void eraseOverlapIntervalsTest3(){
        int[][] intervals = {
                {1,2},
                {2,3},
        };
        int expected = 0;
        int actual = new Solution().eraseOverlapIntervals(intervals);

        Assertions.assertEquals(expected, actual);
    }
}
