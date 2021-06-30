import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver;
    @BeforeMethod
    public void startUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.navigate().to("https://www.google.com/ncr");
    }
    @AfterMethod
    public void EndSession() {
       // driver.quit();

    }
    @Test
    public void GoogleSearchResults() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath(" //input[@class='gLFyf gsfi']")).sendKeys("Mercedes A Class"+ Keys.ENTER);

       int i =0;

   /*do {
            // code block to be executed
            driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("not found in page"+i);
            i++;
        }
        while (driver.getPageSource().contains("TOP GEAR") == false); */

        do {
            // code block to be executed
            driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("not found in page"+i);
            i++;
        }
        while (driver.getPageSource().contains("Strategies in Failure Management: Scientific Insights") == false);
        System.out.println("not found in page"+i);


    }

}
