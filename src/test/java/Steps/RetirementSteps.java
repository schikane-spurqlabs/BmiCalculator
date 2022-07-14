package Steps;

import Pages.RetirementPage;
import Util.TextContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class RetirementSteps extends TextContext {
    RetirementPage retirementPage;
    public RetirementSteps()
    {
        retirementPage= new RetirementPage(driver);
    }
    @Given("User open retirement calculator")
    public void userOpenRetirementCalculator()
    {
        retirementPage.navigateToRetirement();

    }

    @When("user enter your age as {string}")
    public void userEnterYourAgeAs(String age) {
        retirementPage.enterCurrentAge(age);
    }

    @And("user enter Your Planned Retirement Age as {string}")
    public void userEnterYourPlannedRetirementAgeAs(String rAge)
    {
        retirementPage.enterRetirementAge(rAge);
    }

    @And("user enter Your Life Expectancy as {string}")
    public void userEnterYourLifeExpectancyAs(String Expectancy) {
        retirementPage.enterLifeExpectancy(Expectancy);
    }

    @And("user enter Expected Social Security Income as {string}")
    public void userEnterExpectedSocialSecurityIncomeAs(String sIncome) {
        retirementPage.enterSecurityIncome(sIncome);
    }

    @And("user enter Other Income After Retirement as {string}")
    public void userEnterOtherIncomeAfterRetirementAs(String oIncome) {
        retirementPage.enterOtherIncome(oIncome);
    }


    @And("user enter Average investment return as {string}")
    public void userEnterAverageInvestmentReturnAs(String AIR) {
        retirementPage.enterAverageInvestmentReturn(AIR);
    }

    @And("user enter Inflation Rate \\(Annual) as {string}")
    public void userEnterInflationRateAnnualAs(String iRate) {
        retirementPage.enterInflationRate(iRate);
    }

    @And("user enter Your Current Income as {string}")
    public void userEnterYourCurrentIncomeAs(String cIncome) {
        retirementPage.enterCurrentIncome(cIncome);
    }

    @And("user enter Income Needed After Retirement as {string}")
    public void userEnterIncomeNeededAfterRetirementAs(String needIncome) {
        retirementPage.enterIncomeNeeded(needIncome);
    }

    @And("user click on calculate button")
    public void userClickOnCalculateButton()  {

        retirementPage.clickOnCalculate();

    }



    @Then("user see the result as {string}")
    public void userSeeTheResultAs$(String Expected1)  {
        System.out.println(retirementPage.ActResult());

        Assert.assertEquals(retirementPage.ActResult(),Expected1);
    }

    @When("user enter Retirement calculator data as")
    public void userEnterRetirementCalculatorDataAs(DataTable dataTable) {
        List<Map<String,String>> rows = dataTable.asMaps(String.class,String.class);
        for (Map<String, String> columns : rows)
        {

            retirementPage.RetirementCal(columns.get("age"),columns.get("RetirementAge"),columns.get("LifeExpectancy"),
                    columns.get("SocialSecurityIncome"),columns.get("IncomeAfterRetirement"),columns.get("AverageInvestmentReturn"),
                    columns.get("InflationRate"),columns.get("CurrentIncome"),columns.get("IncomeNeeded"));


        }
        }

   /* @When("i enter {string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iEnterAgeRetirementAgeLifeExpectancySocialSecurityIncomeIncomeAfterRetirementAverageInvestmentReturnInflationRateCurrentIncomeIncomeNeeded(String age,String rAge,String Expectancy,String sIncome,String oIncome,String AIR,String IRate,String CI,String IN)
    {
        retirementPage.RetirementCal(age,rAge,Expectancy,sIncome,oIncome,AIR,IRate,CI,IN);
    }*/

    @When("user enter {string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void userEnterAgeRetirementAgeLifeExpectancySocialSecurityIncomeIncomeAfterRetirementAverageInvestmentReturnInflationRateCurrentIncomeIncomeNeeded(String age,String rAge,String Expectancy,String sIncome,String oIncome,String AIR,String IRate,String CI,String IN)
    {
        retirementPage.RetirementCal(age,rAge,Expectancy,sIncome,oIncome,AIR,IRate,CI,IN);
    }

    @Then("user see my BMI index as {string}")
    public void userSeeMyBMIIndexAsExpected(String Expected2) {
        Assert.assertEquals(retirementPage.ActResult(),Expected2);
    }

    @When("user enter Retirement calculator data as vertical")
    public void userEnterRetirementCalculatorDataAsVertical(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        System.out.println(data.get(0));
        retirementPage.RetirementCal(data.get(1).get(1),data.get(2).get(1),data.get(3).get(1),data.get(4).get(1),data.get(5).get(1),data.get(6).get(1),data.get(7).get(1),data.get(8).get(1),data.get(9).get(1));
    }
}
