package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends AbsTest {
    @Test(dataProvider = "double", groups = "SubSum")
    public void multDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a,b), a - b);
    }

    @Override
    public void doubleTest(double a, double b) {

    }
}
