package array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TwoSumTest {
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 3, 4}, 6, new int[]{0, 2}},
                {new int[]{0, 0, 2, 4}, 0, new int[]{0, 1}},
        });
    }

    private int[] nums;
    private int target;
    private int[] expected;

    public TwoSumTest(int[] nums, int target, int[] expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], res[i]);
        }
    }
}