import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ZeroBank {

    public static WebDriver driver;

    public static void tryAndCatch() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver98.exe");
        driver = new ChromeDriver();
        driver.manage()
                .timeouts()
                .implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage()
                .window()
                .maximize();

    }


    public static String navigateTo() {
        driver.get("http://zero.webappsecurity.com/index.html");
        tryAndCatch();
        return driver.getCurrentUrl();
    }


    public static void end() {
        driver.quit();
    }
}
