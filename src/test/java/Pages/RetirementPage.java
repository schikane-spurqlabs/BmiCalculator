package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetirementPage
{
    WebDriver driver;
    public RetirementPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[text()='Retirement Calculator']")
    WebElement RetirementCalculator;
    @FindBy(id="cagenow")
    WebElement currentAge;
    @FindBy(id="cretirementage")
    WebElement retirementAge;
    @FindBy(id="clifeexpectancy")
    WebElement LifeExpectancy;
    @FindBy(id="cssn")
    WebElement securityIncome;
    @FindBy(name="cotherincome")
    WebElement otherIncome;
    @FindBy(id="cinterestrate")
    WebElement investmentReturn;
    @FindBy(id="cinflationrate")
    WebElement inflationRate;
    @FindBy(id="ccurrentincome")
    WebElement currentIncome;
    @FindBy(id="cretiredincomerate")
    WebElement needIncome;
    @FindBy(xpath = "(//input[@type=\"image\"])[1]")
    WebElement Calculate1;
    @FindBy(xpath = "//div[@id='content']//table[1]//tbody//tr[1]//td[2]")
    WebElement result2;

    public void navigateToRetirement()
    {
        RetirementCalculator.click();
    }
    public void enterCurrentAge(String age)
    {   currentAge.clear();
        currentAge.sendKeys(age);
    }
    public void enterRetirementAge(String rAge)
    {   retirementAge.clear();
        retirementAge.sendKeys(rAge);
    }
    public void enterLifeExpectancy(String Expectancy)
    {
        LifeExpectancy.clear();
        LifeExpectancy.sendKeys(Expectancy);
    }
    public  void enterSecurityIncome(String sIncome)
    {
        securityIncome.clear();
        securityIncome.sendKeys(sIncome);
    }
    public void enterOtherIncome(String oIncome)
    {
        otherIncome.clear();
        otherIncome.sendKeys(oIncome);
    }
    public void enterAverageInvestmentReturn( String AIR)
    {
        investmentReturn.clear();
        investmentReturn.sendKeys(AIR);
    }
    public void enterInflationRate(String IRate)
    {
        inflationRate.clear();
        inflationRate.sendKeys(IRate);
    }
    public void enterCurrentIncome(String CI)
    {
        currentIncome.clear();
        currentIncome.sendKeys(CI);
    }
    public void enterIncomeNeeded(String IN)
    {
        needIncome.clear();
        needIncome.sendKeys(IN);
    }
    public void clickOnCalculate()
    {

        Calculate1.click();
    }
    public String ActResult()
    {
        return result2.getText();
    }

    public void RetirementCal(String age,String rAge,String Expectancy,String sIncome,String oIncome,String AIR,String IRate,String CI,String IN)
    {
        currentAge.clear();
        currentAge.sendKeys(age);
        retirementAge.clear();
        retirementAge.sendKeys(rAge);
        LifeExpectancy.clear();
        LifeExpectancy.sendKeys(Expectancy);
        securityIncome.clear();
        securityIncome.sendKeys(sIncome);
        otherIncome.clear();
        otherIncome.sendKeys(oIncome);
        investmentReturn.clear();
        investmentReturn.sendKeys(AIR);
        inflationRate.clear();
        inflationRate.sendKeys(IRate);
        currentIncome.clear();
        currentIncome.sendKeys(CI);
        needIncome.clear();
        needIncome.sendKeys(IN);
        Calculate1.click();
    }
}


