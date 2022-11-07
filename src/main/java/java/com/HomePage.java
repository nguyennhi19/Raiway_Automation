package java.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
  private String RAILWAY_URL = "http://www.railwayb2.somee.com/Page/HomePage.cshtml";

    //elements

    //methods
    WebDriver driver = new ChromeDriver();
    public void open() {
        driver.navigate().to(RAILWAY_URL);
}
