package Test;

import Util.TextContext;
import org.testng.annotations.Test;

public class TestClass extends TextContext
{
   /* public PageLayer pageLayer;
    public  TestClass()
    {
        pageLayer = new PageLayer(driver);
    }
    @Test
    public void bmi()
    {    //  pageLayer.salaryCalculator("250","Day","40","65","64","12","$598,000");
        pageLayer.UsClick();
        pageLayer.bmi("19","male","5","7","140","BMI = 21.9 kg/m2   (42%, Healthy weight)");
    }/*

   /* @BeforeClass
    public void initialise()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");


    }

    @AfterClass
    public void teardown()
    {
        driver.close();
    }*/
}
