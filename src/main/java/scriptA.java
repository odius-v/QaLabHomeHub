import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptA {
    public static void main(String[] args) {

        WebDriver driver = initChromeDriver.initChrome();

        new loginAdmin(driver).loginMethod();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new logoutAdmin(driver).logoutMethod();
        driver.quit();
    }


    }