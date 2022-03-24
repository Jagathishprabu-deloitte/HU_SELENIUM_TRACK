package selenium_mini_assignment_3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BookGoIbibo {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,60);
        maximize(driver);
        navigate(driver);
    }
    public static void maximize(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    public static void navigate(WebDriver driver) throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.get("https://www.goibibo.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='sc-gsNilK dImRia'][text()='Round-trip']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'][text()='Enter city or airport']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New York");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='autoSuggest-list']/li[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Seattle");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='autoSuggest-list']/li[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[3]/span")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File newFile =new File("src\\ScreenShot.png");
        FileUtils.copyFile(srcFile,newFile);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,10000)");
        Thread.sleep(3000);
        driver.quit();
    }
}
