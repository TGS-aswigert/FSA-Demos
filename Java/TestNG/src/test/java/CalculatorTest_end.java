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
        Assert.assertEquals(expected, actual);
    }

    @Test
    public static void subtractShouldReturn0Given2And2() {
        Assert.assertEquals(0, Calculator_end.subtract(2,2));
    }

    @Test
    public static void multiplyReturns4Given2and2() {
        Assert.assertEquals(4, Calculator_end.multiply(2,2));
    }

    @Test
    public static void multiplyShouldReturnANegativeGivenOneNegativeArgument() {
        Assert.assertEquals(-4, Calculator_end.multiply(2,-2));
    }

    @Test
    public static void divideShouldReturn2Given4And2() {
        Assert.assertEquals(2, Calculator_end.divide(4,2));
    }

    @Test
    public static void divideShouldReturnErrorGivenDenominatorOf0() {
        Assert.assertThrows(Error.class, () -> Calculator_end.divide(2, 0));
    }

}
