package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeTablePage {
    // Locators1234567890
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

//    //Methods
//    WebDriver driver = new ChromeDriver();
//    public String getDepartFromAndArriveAt(String departFrom, String arriveAt){
//        String text = "//td[text()='%s']//following-sibling::td[text()='%s']//following-sibling::td//a[text()='book ticket']";
//        return String.format(text, departFrom, arriveAt);
//    }
//
//    public void bookTicketFromTimeTablePage(String departFrom, String arriveAt){
//        driver.findElement(By.xpath(getDepartFromAndArriveAt(departFrom,arriveAt))).click();
//    }
}
