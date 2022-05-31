import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SitetrackerSalesforceRequirementSteps
{
    @Given("^browser is launched and salesforce site is open$")
    public void givenSalesforceOpen() {
        salesforcehome=null;
        openSalesforceBrowser();
   }

    @When("^the Component Reference tab is opened$")
    public void whenStatement(){
        
    }

    @Then("^run should be successful$")
    public void thenStatement(){
        System.out.println("Then statement executed successfully");
    }
}
