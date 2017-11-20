import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginAdmin {

    static WebDriver driver = null;

    public loginAdmin(WebDriver driver) {
        this.driver = driver;
    }
    public static WebDriver loginMethod() {
        String emailAdmin = "webinar.test@gmail.com";
        String passAdmin = "Xcg7299bnSmMuRLp9ITw";
        
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("emailAdmin");
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("passAdmin");
        WebElement buttonVhod = driver.findElement(By.className("ladda-button"));
        buttonVhod.click();
        System.out.println("Successful loging in to Admin panel");
        return driver;
    }
}
