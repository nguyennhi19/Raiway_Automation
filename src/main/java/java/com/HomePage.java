package java.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static final String RAILWAY_URL = "http://www.railwayb2.somee.com/Page/HomePage.cshtml";

    public void open() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(RAILWAY_URL);
    }
}
