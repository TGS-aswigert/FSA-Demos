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
        car.setColor(Color.BLACK);
        Assert.assertEquals(car.getTotalPrice(), 20_000.00);
    }

    @Test
    public void totalPriceOfBlueCarShouldBe22k() {
        Car car = new Car();
        car.setColor(Color.BLUE);
        Assert.assertEquals(car.getTotalPrice(), 22_000.00);
    }

    @Test
    public void totalPriceOfWhiteCarShouldBe20_800() {
        Car car = new Car();
        car.setColor(Color.WHITE);
        Assert.assertEquals(car.getTotalPrice(), 20_800.00);
    }

    @Test
    public void totalPriceOfRedCarShouldBe25k() {
        Car car = new Car();
        car.setColor(Color.RED);
        Assert.assertEquals(car.getTotalPrice(), 25_000.00);
    }

    @Test
    public void totalPriceOfGreenCarShouldBe23_500() {
        Car car = new Car();
        car.setColor(Color.GREEN);
        Assert.assertEquals(car.getTotalPrice(), 23_500.00);
    }

    @Test
    public void totalPriceOfYellowCarShouldBe21_500() {
        Car car = new Car();
        car.setColor(Color.YELLOW);
        Assert.assertEquals(car.getTotalPrice(), 21_500.00);
    }
}
