package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TextContext
{
    public static WebDriver driver;
  //  public static PageLayer pageLayer;
  /*  @BeforeClass
    public void initialise()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        pageLayer = new PageLayer();
        //return driver;

    }

  @AfterClass
   public void teardown()
    {
        driver.close();
    }*/


}
