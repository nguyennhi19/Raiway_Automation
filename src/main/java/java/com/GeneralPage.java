package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GeneralPage {
    //Locators
    private final By tabLogin = By.linkText("Login");
    private final By tabLogout = By.linkText("Log out");
    private final By tabBookTicket = By.linkText("Book ticket");
    private final By tabContact = By.linkText("Contact");
    private final By tabRegister = By.linkText("Register");
    private final By tabChangePassword = By.linkText("Change password");
    private final By tabTimeTable = By.linkText("Timetable");
    private final By tabMyTicket = By.linkText("My ticket");
    private final By lblWelcomeUser = By.xpath("//div[@class='account']//strong");

    //Elements

    WebDriver driver = new ChromeDriver();

    protected WebElement getTabLogin() {
        return driver.findElement(tabLogin);
    }

    protected WebElement getTabLogout() {
        return driver.findElement(tabLogout);
    }

    protected WebElement getTabBookTicket() {
        return driver.findElement(tabBookTicket);
    }

    protected WebElement getTabContact() {
        return driver.findElement(tabContact);
    }

    protected WebElement getTabRegister() {
        return driver.findElement(tabRegister);
    }

    protected WebElement getTabChangePassword() {
        return driver.findElement(tabChangePassword);
    }

    protected WebElement getTabTimetable() {
        return driver.findElement(tabTimeTable);
    }

    protected WebElement getTabMyTicket() {
        return driver.findElement(tabMyTicket);
    }

    protected WebElement getWelcomeUserElement() {
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
