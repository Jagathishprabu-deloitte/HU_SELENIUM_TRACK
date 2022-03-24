package selenium_mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
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
    public static void navigate(WebDriver driver){
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@href='/frames']")).click();
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        //WebElement frameElement = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.quit();
    }
}
