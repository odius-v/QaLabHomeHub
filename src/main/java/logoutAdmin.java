import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutAdmin {

    static WebDriver driver = null;

    public logoutAdmin(WebDriver driver){
        this.driver = driver;
    }
    public static WebDriver logoutMethod() {
      // WebDriver driver = initChromeDriver.initChrome();
        WebElement avatar = driver.findElement(By.className("employee_avatar_small"));
        avatar.click();
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
        System.out.println("Successful logout");
        return driver;
    }
}