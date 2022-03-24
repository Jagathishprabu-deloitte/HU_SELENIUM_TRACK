package selenium_mini_assignment_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicket {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagats\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        maximize(driver);
        navigate(driver);
    }
    public static void maximize(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    public static void navigate(WebDriver driver){
        driver.get("https://www.goibibo.com/");
    }
}
