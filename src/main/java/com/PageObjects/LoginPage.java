package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    //Locator1234567890
    private By txtEmail = By.xpath("//input[@id=\"username\"]");
    private By txtPassword = By.xpath("//input[@id=\"password\"]");
    private By btnLogin = By.xpath("//input[@value=\"Login\"]");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getTextEmail(){
        return driver.findElement(txtEmail);
    }

    private WebElement getTextPassword(){
        return driver.findElement(txtPassword);
    }

    private WebElement getBtnLogin(){
        return driver.findElement(btnLogin);
    }

    //Methods
    public void login(String email, String password){
    getTextEmail().sendKeys(email);
    getTextPassword().sendKeys(password);
    getBtnLogin().click();
    }

}
