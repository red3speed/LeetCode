package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SingleNumberTest {
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 2, 1, 4, 3, 5, 3}, 5},
        });
    }

    private int[] source;
    private int expected;

    public SingleNumberTest(int[] source, int expected) {
        this.source = source;
        this.expected = expected;
    }

    @Test
    public void solve() {
        SingleNumber solution = new SingleNumber();
        Assert.assertEquals(expected, solution.solve(source));
    }
}