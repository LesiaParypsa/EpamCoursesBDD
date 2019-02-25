package Test.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver implements DriverSource {
    private WebDriver driver;

    @Override
    public WebDriver newDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disabel-infobars", "--disable-extensions");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
