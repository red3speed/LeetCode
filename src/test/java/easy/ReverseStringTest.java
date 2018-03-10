package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReverseStringTest {
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"hello", "olleh"},
        });
    }

    private String source;
    private String expected;

    public ReverseStringTest(String source, String expected) {
        this.source = source;
        this.expected = expected;
    }

    @Test
    public void solve() {
        ReverseString solution = new ReverseString();
        Assert.assertEquals(expected, solution.solve(source));
    }
}