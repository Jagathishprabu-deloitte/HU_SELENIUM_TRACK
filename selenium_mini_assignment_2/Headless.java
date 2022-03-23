package selenium_mini_assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver= new ChromeDriver(options);
        maximize(driver);
        navigate(driver);
        loginPage(driver);
        pricingAndBack(driver);
    }
    public static void maximize(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    public static void navigate(WebDriver driver){
        driver.get("https://phptravels.com/demo");
        String str=driver.getTitle();
        if(str.contains("PHPTRAVELS")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
    public static void loginPage(WebDriver driver){
        String str1 = driver.getTitle();
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@href='https://phptravels.org/']")).click();
        String newWindow = driver.getWindowHandle();
        driver.switchTo().window(newWindow);
        String str2 = driver.getTitle();
        System.out.println(str1+str2);
        if(str1.equals(str2)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        driver.switchTo().window(parentWindow);
    }

    public static void pricingAndBack(WebDriver driver){
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        String str = driver.getCurrentUrl();
        System.out.println(str);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.switchTo().window(parentWindow);
    }
}
