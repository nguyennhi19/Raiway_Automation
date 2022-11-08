package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GeneralPage {
    //Locators
    private final By tabLogin = By.linkText("Login");
    private final By tabLogout = By.linkText("Log out");
    private final By tabBookTicket = By.linkText("Book ticket");
    private final  By tabContact = By.linkText("Contact");
    private final By tabRegister = By.linkText("Register");
    private final By tabChangePassword = By.linkText("Change password");
    private final By tabTimeTable = By.linkText("Timetable");
    private final By tabMyTicket = By.linkText("My ticket");
    private final By lblWelcomeUser = By.xpath("//div[@class='account']//strong");

    //Elements

    WebDriver driver = new ChromeDriver();

    private WebElement getTabLogin() {
        return driver.findElement(tabLogin);
    }

    private WebElement getTabLogout() {
        return driver.findElement(tabLogout);
    }

    private WebElement getTabBookTicket() {
        return driver.findElement(tabBookTicket);
    }

    private WebElement getTabContact() {
        return driver.findElement(tabContact);
    }

    private WebElement getTabRegister() {
        return driver.findElement(tabRegister);
    }

    private WebElement getTabChangePassword() {
        return driver.findElement(tabChangePassword);
    }

    private WebElement getTabTimetable() {
        return driver.findElement(tabTimeTable);
    }

    private WebElement getTabMyTicket() {
        return driver.findElement(tabMyTicket);
    }

    private WebElement getWelcomeUserElement() {
        return driver.findElement(lblWelcomeUser);
    }

    //Methods
    public void getWelcomeUser() {
        getWelcomeUserElement().getText();
    }

    public void gotoLoginPage() {
        getTabLogin().click();
    }

    public void logout() {
        if (getTabLogout() != null)
            getTabLogout().click();
    }

    public void gotoBookTicketPage() {
        getTabBookTicket().click();
    }

    public void gotoContactPage() {
        getTabContact().click();
    }

    public void gotoRegisterPage() {
        getTabRegister().click();
    }

    public void gotoChangePasswordPage() {
        getTabChangePassword().click();
    }

    public void gotoTimetablePage() {
        getTabTimetable().click();
    }

    public void gotoMyTicketPage() {
        getTabMyTicket().click();
    }
}
