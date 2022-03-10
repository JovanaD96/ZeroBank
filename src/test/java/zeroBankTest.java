import org.testng.Assert;
import org.testng.annotations.*;

public class zeroBankTest {

    @BeforeClass
    public void beforeClass() {
        ZeroBank.setup();
//        ZeroBank.navigateTo();

    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @Test
    public void test() {
        Assert.assertEquals(ZeroBank.navigateTo(),"http://zero.webappsecurity.com/index.html");


    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
        ZeroBank.end();
    }
}
