import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class WebsiteDisplayer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("marionette", true);
        FirefoxBinary firefoxBinary = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
        FirefoxDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000 * 15);
        driver.close();
    }
}
