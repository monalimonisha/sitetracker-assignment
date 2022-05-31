import org.junit.Assert;

import pom.SalesforcePage;
import utils.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SitetrackerSalesforceRequirementSteps extends BaseTest {

	public SalesforcePage componentsReferenceTab;
	
    @Given("^browser is launched and salesforce site is open$")
    public void givenSalesforceOpen() {
        componentsReferenceTab=null;
        openSalesforceInBrowser();
   }

    @And("^the Component Reference tab is opened$")
    public void componenetReferenceTabOpen(){
    	componentsReferenceTab.clickComponentReferenceTab();
    	//assertion to check Component Reference Tab is open
    	Assert.assertTrue(componentsReferenceTab.isComponentReferencePageDisplayed());
    }

    @And("^'(.*)' is searched in quick find$")
    public void searchInQuickFind(String search)throws InterruptedException{
        componentsReferenceTab.sendKeysInQuickFind(search);
    }
    
    @And("^'(.*)' is clicked$")
    public void optionIsClicked(String option)throws InterruptedException{
    	if(option == "datatable"){
    		componentsReferenceTab.clickDatatableOption();
    		//wait for example tab to be displayed on screen
    		componentsReferenceTab.waitForExampleElement();
    	}
    }
    
    @And("^'(.*)' is selected under Examples tab in the main pane$")
    public void dropdownOptionSelect(String dropdownOption)throws InterruptedException{
    	componentsReferenceTab.dropdownSelect(dropdownOption);
    	//scroll up to be able to see the Preview
    	componentsReferenceTab.scrollIntoViewOfPreview();
    }
    
    @And("Run button is clicked$")
    public void clickRunButton(String dropdownOption)throws InterruptedException{
    	componentsReferenceTab.clickRunButton();
    	//wait until in third row to be displayed under Preview
    	componentsReferenceTab.waitForThirdRowInTable();
    }
    
    @When("the values in '(.*)' row is updated with '(.*)', '(.*)', '(.*)', '(.*)', '(.*)', '(.*)'")
    public void updateValueinRow(int row, String label, String website, String phonenumber,
    				String date, String time, String balance){
    	
    	if (row == 3){
    		//click on pencil icon for label column, edit the values and press TAB from keyboard
    		componentsReferenceTab.editThirdRowName();
    		componentsReferenceTab.sendKeysNameTextBox(label);
    		
    		//click on pencil icon for website column, edit the values and press TAB from keyboard
    		componentsReferenceTab.editThirdRowLink();
    		componentsReferenceTab.sendKeysUrlTextBox(website);
    		
    		//click on pencil icon for phone no column, edit the values and press TAB from keyboard
    		componentsReferenceTab.editThirdRowPhoneNo();
    		componentsReferenceTab.sendKeysPhoneNoTextBox(phonenumber);
    		
    		//click on pencil icon for Closes At column, click on calender and select today
    		//select time and press TAB from keyboard
    		componentsReferenceTab.editThirdRowDate();
    		componentsReferenceTab.clickThirdRowDateCalender();
    		componentsReferenceTab.sendKeysTimeCalenderTextBox(time);
    		
    	
    		//click on pencil icon for balance column, edit the values and press TAB from keyboard
    		componentsReferenceTab.editThirdRowAmount();
    		componentsReferenceTab.sendKeysBalanceTextBox(balance);
    	  }
    }
    	
    	
    	@Then("the details for '(.*)' should display as '(.*)', '(.*)', '(.*)', '(.*)', '(.*)'")
        public void validateValueinRow(int row, String label, String website, String phonenumber,
        				String date, String balance){
        	
        	if (row == 3){
        		
        		Assert.assertEquals(label, componentsReferenceTab.getnameDisplayed());
        		Assert.assertEquals(label, componentsReferenceTab.getUrlDisplayed());
        		Assert.assertEquals(label, componentsReferenceTab.getPhoneNoDisplayed());
        		Assert.assertEquals(label, componentsReferenceTab.getDateDisplayed());
        		Assert.assertEquals(label, componentsReferenceTab.getAmountDisplayed());
        	}
    	
    }
}
