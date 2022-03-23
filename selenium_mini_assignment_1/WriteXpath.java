package selenium_mini_assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WriteXpath {
    public WebDriver driver;
    public void first() {
        By logo_PHPTRAVELS = By.xpath("//div[@class=\"logo\"]//img[@alt=\"logo\"]");
        By home_PHPTRAVELS = By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/\"]");
        By flights_PHPTRAVELS = By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/flights\"]");
        By tours_PHPTRAVAVELS = By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/tours\"]");
        By company_PHPTRAVAVELS = By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"company\"]");
        By signupButton = By.xpath("//a[@href=\"https://www.phptravels.net/signup\"]");
        By loginButton = By.xpath("//a[@class=\"theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect\"]");
        By agentsDropdown = By.xpath("//div[@class=\"dropdown\"]//button[@id=\"agents\"]");
    }
}


//*[@id="hotels-search"]/div/div/div[2]/div/div[2]/div/span