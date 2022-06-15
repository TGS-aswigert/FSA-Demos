import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void defaultTotalPriceShouldBe20k() {
        Car car = new Car();
        Assert.assertEquals(car.getTotalPrice(), 20_000.00);
    }

    @Test
    public void totalPriceOfBlackCarShouldBe20k() {
        Car car = new Car();
        car.setColor("Black");
        Assert.assertEquals(car.getTotalPrice(), 20_000.00);
    }

    @Test
    public void totalPriceOfBlueCarShouldBe22k() {
        Car car = new Car();
        car.setColor("Blue");
        Assert.assertEquals(car.getTotalPrice(), 22_000.00);
    }

    @Test
    public void totalPriceOfWhiteCarShouldBe20_800() {
        Car car = new Car();
        car.setColor("White");
        Assert.assertEquals(car.getTotalPrice(), 20_800.00);
    }

    @Test
    public void totalPriceOfRedCarShouldBe25k() {
        Car car = new Car();
        car.setColor("Red");
        Assert.assertEquals(car.getTotalPrice(), 25_000.00);
    }

    @Test
    public void totalPriceOfGreenCarShouldBe23_500() {
        Car car = new Car();
        car.setColor("Green");
        Assert.assertEquals(car.getTotalPrice(), 23_500.00);
    }

    @Test
    public void totalPriceOfYellowCarShouldBe21_500() {
        Car car = new Car();
        car.setColor("Yellow");
        Assert.assertEquals(car.getTotalPrice(), 21_500.00);
    }
}
