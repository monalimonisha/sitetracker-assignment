package utils;

public class BaseTest {

	public void openSalesforceInBrowser(){
		
		if(salesforce != null){
			salesforce.open();
		}
		else{
			salesforce = new Salesforce(BrowserDriver.getDriver());
			BrowserDriver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit,SECONDS);
			BrowserDriver.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit,SECONDS);
		}
		
	}
	
	
}
