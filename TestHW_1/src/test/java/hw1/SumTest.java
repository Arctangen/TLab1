package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends AbsTest {
    @Test(dataProvider = "double", groups = "SumSub")
    public void sumDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.sum(a,b), a + b);
    }

    @Override
    public void doubleTest(double a, double b) {
    }
}
