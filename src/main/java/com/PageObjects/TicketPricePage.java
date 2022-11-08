package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketPricePage {
    //Locator
    private By btnCheckPrice = By.xpath("//li[text()='%s to %s']/parent::td//following-sibling::td//a[text()='Check Price']");
    private By btnBookTicket = By.xpath("//td[text()='%s']//following-sibling::td//a");
    private By PriceOfEachSeat= By.xpath("//th[contains(text(),'Price')]//following-sibling::td[%s]");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getBtnCheckPrice(){
        return driver.findElement(btnCheckPrice);
    }

    private WebElement getBtnBookTicket(){
        return driver.findElement(btnBookTicket);
    }

    private WebElement gettextPriceOfEachSeat(){
        return driver.findElement(PriceOfEachSeat);
    }



    public String getTrain(String departFrom, String arriveAt){
        String text = "//li[text()='"+departFrom+" to "+arriveAt+"']/parent::td//following-sibling::td//a[text()='Check Price']";
        return text;
    }

    //Methods
    public void checkPriceFromTicketPricePage(String departFrom, String arriveAt){
        driver.findElement(By.xpath(getTrain(departFrom,arriveAt))).click();
    }
}
