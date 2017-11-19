import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginAdmin {
    public static WebDriver loginMethod() {
        WebDriver driver = initChromeDriver.initChrome();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement buttonVhod = driver.findElement(By.className("ladda-button"));
        buttonVhod.click();
        System.out.println("Successful loging in to Admin panel");
        return driver;
    }
}
