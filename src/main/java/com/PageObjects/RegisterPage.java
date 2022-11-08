package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
    //Locator
    private By txtEmail = By.xpath("//input[@id=\"email\"]");
    private By txtPassword = By.xpath("//input[@id=\"password\"]");
    private By txtConfirmPassword = By.xpath("//input[@id=\"confirmPassword\"]");
    private By txtPid = By.xpath("//input[@id=\"pid\"]");
    private By btnRegister = By.xpath("//input[@value=\"Register\"]");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getTextEmail(){
        return driver.findElement(txtEmail);
    }

    private WebElement getTextPassword(){
        return driver.findElement(txtPassword);
    }

    private WebElement getTextConfirmPassword(){
        return driver.findElement(txtConfirmPassword);
    }

    private WebElement getTextPid(){
        return driver.findElement(txtPid);
    }

    private WebElement getBtnRegister(){
        return driver.findElement(btnRegister);
    }

    //Methods
    public void register(String email,String password,String confirmPassword, String pid){
        getTextEmail().sendKeys(email);
        getTextPassword().sendKeys(password);
        getTextConfirmPassword().sendKeys(confirmPassword);
        getTextPid().sendKeys(pid);
        getBtnRegister().click();
    }
}
