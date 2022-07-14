package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BmiBaseClass extends TextContext
{
    @Before
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
    }

  @After
    public  void  terminate()
    {
        driver.close();
    }
}
