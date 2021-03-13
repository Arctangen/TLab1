package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTest extends AbsTest {
    @Test(dataProvider = "double", groups = "DivMult")
    public void multDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.mult(a,b), a * b);
    }

    @Override
    public void doubleTest(double a, double b) {

    }
}
