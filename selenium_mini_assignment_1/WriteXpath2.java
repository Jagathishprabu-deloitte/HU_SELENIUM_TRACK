package selenium_mini_assignment_1;

import org.openqa.selenium.By;

public class WriteXpath2 {
    public void second(){
        By checkIn = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[2]//div[@class='col-md-6'][1]//div[1]/child::span");
        By checkOut = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[2]//div[@class='col-md-6'][2]//div[1]/child::span");
        By minusAdult = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[3]//div[@class='dropdown-menu dropdown-menu-wrap']//div[2][@class='dropdown-item']//div[1]//div/child::div[1]");
        By plusAdult = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[3]//div[@class='dropdown-menu dropdown-menu-wrap']//div[2][@class='dropdown-item']//div[1]/child::div[2]");
        By minusChild = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[3]//div[@class='dropdown-menu dropdown-menu-wrap']//div[3][@class='dropdown-item']//div[1]//div/child::div[1]");
        By plusChild = By.xpath("//*[@id='hotels-search']//div[@class='row g-1']//div[3]//div[@class='dropdown-menu dropdown-menu-wrap']//div[3][@class='dropdown-item']//div[1]//div/child::div[2]");
    }
}
