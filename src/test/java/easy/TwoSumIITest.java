package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TwoSumIITest {
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}}
        });
    }

    private int[] nums;
    private int target;
    private int[] expected;

    public TwoSumIITest(int[] nums, int target, int[] expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    @Test
    public void solve() {
        TwoSumII solution = new TwoSumII();
        int[] res = solution.solve(nums, target);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], res[i]);
        }
    }
}