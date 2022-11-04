package java.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
    //Locator
    private By txtCurrentPassword = By.xpath("//input[@id=\"currentPassword\"]");
    private By txtNewPassword = By.xpath("//input[@id=\"newPassword\"]");
    private By txtConfirmPassword = By.xpath("//input[@id=\"confirmPassword\"]");
    private By btnChangePassword = By.xpath("//input[@value=\"Change Password\"]");

    //Elements
    WebDriver driver = new ChromeDriver();

    private WebElement getTextCurrentPassword(){
        return driver.findElement(txtCurrentPassword);
    }

    private WebElement getTextNewPassword(){
        return driver.findElement(txtNewPassword);
    }

    private WebElement getTextConfirmPassword(){
        return driver.findElement(txtConfirmPassword);
    }

    private WebElement getBtnChangePassword(){
        return driver.findElement(btnChangePassword);
    }

    //Methods
    public void changePassword(String currentPassword,String newPassword,String confirmPassword){
        getTextCurrentPassword().sendKeys(currentPassword);
        getTextNewPassword().sendKeys(newPassword);
        getTextConfirmPassword().sendKeys(confirmPassword);
        getBtnChangePassword().click();
    }
}
