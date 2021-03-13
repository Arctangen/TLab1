package hw1;

import com.epam.tat.module4.Calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public abstract class AbsTest {

    @DataProvider(name = "double")
    public Object[][] createDouble() {
        return new Object[][] {
                {0., 0.},
                {1., -1.},
                {1., -7.},
                {2., 1.},
                {2., 4.},
                {15., 4.},
                {-2., 4.},
        };
    }

    protected Calculator calculator = new Calculator();

    @Test
    public abstract void doubleTest(double a, double b);

}
