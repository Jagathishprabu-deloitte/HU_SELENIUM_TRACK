package selenium_mini_assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ChromeDriverExecute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
        /*String newWindow = driver.getWindowHandle();
        driver.switchTo().window(newWindow);
        String str2 = driver.getTitle();*/
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        String str2=(driver.switchTo().window(tabs.get(1))).getTitle();
        String title1=(driver.switchTo().window(tabs.get(0))).getTitle();
        if(str1.equals(str2)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        driver.switchTo().window(parentWindow);
    }

    public static void pricingAndBack(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        String str = driver.getCurrentUrl();
        System.out.println(str);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
