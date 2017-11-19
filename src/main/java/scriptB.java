import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

public class scriptB {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver.initChrome();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement buttonVhod = driver.findElement(By.className("ladda-button"));
        buttonVhod.click();
        System.out.println("Successful loging in to Admin panel");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // List<WebElement> menuItems = driver.findElement(By.className("menu")).getAttribute("href"); // findElements(By.tagName("a"));
        //List<WebElement> menuItems = driver.findElement(By.className("menu")).findElements(By.className("maintab"));
        List<WebElement> menuItems = driver.findElements(By.className("maintab"));
        System.out.println("Обнаружено " + menuItems.size() + " разделов меню");
        System.out.println(menuItems.get(0));
        System.out.println(menuItems.get(1));
        System.out.println(menuItems.get(2));
        System.out.println(menuItems.get(3));


          for(WebElement aaa : menuItems) {
            aaa.click();

        //for (int i = 0; i<=menuItems.size(); i++)
        //  WebElement clickMenu = menuItems.get(i);
        //clickMenu.click();



           // driver.get(driver.findElement(By.className("main")).findElement(By.tagName("a")))
          //----------  driver.get(menuItems(0));
            //driver.get(aaa.findElement(By.className("maintab")).getAttribute("href"));


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement pageTitle = driver.findElement(By.className("page-title"));

            System.out.println("title is " + pageTitle.getText());
            String titleBeforeRefresh = pageTitle.getText();
            // System.out.println("string" + titleBeforeRefresh);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.navigate().refresh();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement pageTitleRefresh = driver.findElement(By.className("page-title"));

            // System.out.println(pageTitleRefresh.getText());
            String titleAfterRefresh = pageTitleRefresh.getText();
            //System.out.println(titleAfterRefresh + " titleAfterRefresh");
            if (titleBeforeRefresh.equals(titleAfterRefresh)) //pageTitleRefresh.getText()))
            {
                System.out.println("Пользователь в том же разделе " + titleAfterRefresh);
            } else {
                System.out.println("ERROR: Пользователь в другом разделе после обновления страницы");
            }

            /** driver.navigate().refresh() */
            //}
        }
    }

    public static WebDriver initChrome() {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                return new ChromeDriver();
            }
    }
