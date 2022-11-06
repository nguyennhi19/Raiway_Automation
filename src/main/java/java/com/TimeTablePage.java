package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeTablePage {
    // Locators

    //Elements

    //Methods
    WebDriver driver = new ChromeDriver();
    public String getDepartFromAndArriveAt(String departFrom, String arriveAt){
        String text = "//td[text()='%s']//following-sibling::td[text()='%s']//following-sibling::td//a[text()='book ticket']";
        return String.format(text, departFrom, arriveAt);
    }

    public void bookTicketFromTimeTablePage(String departFrom, String arriveAt){
        driver.findElement(By.xpath(getDepartFromAndArriveAt(departFrom,arriveAt))).click();
    }
}
