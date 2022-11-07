package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeTablePage {
    // Locators
    private By btnCheckPrice = By.xpath("//td[text()='%s']//following-sibling::td[text()='%s']//following-sibling::td//a[text()='check price']");
    private By btnBookTicket = By.xpath("//td[text()='%s']//following-sibling::td[text()='%s']//following-sibling::td//a[text()='book ticket']");
    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getBtnCheckPrice(){
        return driver.findElement(btnCheckPrice);
    }
    private WebElement getBtnBookTicket(){
        return driver.findElement(btnBookTicket);
    }

    //Methods
    
}
