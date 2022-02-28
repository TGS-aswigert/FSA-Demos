import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest_end {
    @Test
    public static void addShouldReturn4Given2And2() {
        //arrange
        float expected = 4;
        float actual;
        //act
        actual = Calculator_end.add(2,2);
        //assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public static void subtractShouldReturn0Given2And2() {
        Assert.assertEquals(Calculator_end.subtract(2,2), 0);
    }

    @Test
    public static void multiplyReturns4Given2and2() {
        Assert.assertEquals(Calculator_end.multiply(2,2), 4);
    }

    @Test
    public static void multiplyShouldReturnANegativeGivenOneNegativeArgument() {
        Assert.assertEquals(Calculator_end.multiply(2,-2), -4);
    }

    @Test
    public static void divideShouldReturn2Given4And2() {
        Assert.assertEquals(Calculator_end.divide(4,2), 2);
    }

    @Test
    public static void divideShouldThrowExceptionGivenDenominatorOf0() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Calculator_end.divide(2, 0));
    }

}
