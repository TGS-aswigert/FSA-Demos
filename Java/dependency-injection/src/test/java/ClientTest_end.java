import java_end.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientTest_end {
//    @Test
//    public void doSomethingShouldReturnMockDataGivenMockService() {
//        String expected = "Mock Service info";
//        String actual;
//
//        Service mockService = new MockService();
//        Client client = new Client(mockService);
//        actual = client.doSomething();
//
//        Assert.assertEquals(actual, expected);
//    }

//    @Test
//    public void doSomethingShouldReturnMockDataGivenMockService() {
//        String expected = "Mock Service info";
//        String actual;
//
//        Service mockService = new MockService();
//        Client client = new Client();
//        client.setService(mockService);
//        actual = client.doSomething();
//
//        Assert.assertEquals(actual, expected);
//    }

    @Test
    public void doSomethingShouldReturnMockDataGivenMockService() {
        String expected = "Mock Service info";
        String actual;

        Service mockService = new MockService();
        Client client = new Client();
        actual = client.doSomething(mockService);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void doSomethingElseShouldReturn10GivenMockIntService() {
        int expected = 10;
        int actual;

        IntService mockService = new MockIntService();
        Client client = new Client();
        actual = client.doSomethingElse(mockService);

        Assert.assertEquals(actual, expected);
    }
}
