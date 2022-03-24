package selenium_mini_assignment_3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        maximize(driver);
        navigate(driver);
        //draganddrop(driver);
    }
    public static void maximize(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    public static void navigate(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert popup=driver.switchTo().alert();
        String popupText = popup.getText();
        System.out.println(popupText);
        driver.switchTo().alert().sendKeys(popupText);
        Thread.sleep(3000);
        popup.accept();
        Thread.sleep(3000);
        String input=driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(input.contains(popupText)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        driver.quit();
        //driver.navigate().back();
    }
//    public static void draganddrop(WebDriver driver){
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        driver.findElement(By.xpath("//a[@href='/drag_and_drop']")).click();
//        WebElement draggable = driver.findElement(By.id("column-a"));
//        WebElement droppable = driver.findElement(By.id("coulmn-b"));
//        javascriptExecutor.executeScript();
//
//    }
}
