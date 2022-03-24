package selenium_mini_assignment_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Draganddrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        maximize(driver);
        navigate(driver);
    }
    public static void maximize(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    public static void navigate(WebDriver driver) {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //action.dragAndDrop(dragElement,dropElement).build().perform();
        Action dragDrop = action.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build();
        dragDrop.perform();
        System.out.println("Completed");
        driver.quit();
    }
}
