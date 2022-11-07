package java.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    

    public void open() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.railwayb2.somee.com/Page/HomePage.cshtml");
    }
}
