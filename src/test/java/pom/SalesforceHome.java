package pom;

import utils.BaseTest;


public class SalesforcePage extends PageObject {
	
	public SalesforceHome (WebDriver driver){
		super (webDriver);
		this.driver = driver;
		PageFactory.initElement(webDriver, this);
	}
	
	@FindBy (css = "span.slds-truncate")
	private WebElement componentReference;
	
	@FindBy (css = ".slds-text-heading_medium")
	private WebElement componentReferencePage;
	
	@FindBy (css = "input#input-64")
	private WebElement quickFind;
	
	@FindBy (css = "span[title="datatable"]")
	private WebElement datatable;
	
	@FindBy (css = "example__item")
	private WebElement exampleElement;
	
	@FindBy (css = "button[aria-controls="dropdown-element-390"]")
	private WebElement exampleDropdown;
	
	@FindBy (css = "playground-app > header")
	private WebElement previewElement;
	
	@FindBy (css = "lightning-button > button[class="slds-button slds-button_neutral"] > lightning-primitive-icon")
	private WebElement runButton;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3)")
	private WebElement thirdRow;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) svg[data-key="edit"]")
	private WebElement pencilThirdRowName;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) > td:nth-of-type(3)  svg[data-key="edit"]")
	private WebElement pencilThirdRowLink;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) > td:nth-of-type(4)  svg[data-key="edit"])
	private WebElement pencilThirdRowPhoneNo;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) > td:nth-of-type(5)  svg[data-key="edit"])
	private WebElement pencilThirdRowDate;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) > td:nth-of-type(6)  svg[data-key="edit"])
	private WebElement pencilThirdRowAmount;
	
	@FindBy ( id = "input[name="dt-inline-edit-text"]")
	private WebElement nameTextBox;
	
	@FindBy (id = "input[name="dt-inline-edit-url"]")
	private WebElement urlTextBox;
	
	@FindBy (id = "input[name="dt-inline-edit-phone"]")
	private WebElement phoneNoTextBox;
	
	@FindBy (css = "input[name = "dt-inline-edit-datetime"]")
	private WebElement dateCalender;
		
	@FindBy (css = "lightning-base-combobox input[name = "dt-inline-edit-datetime"]")
	private WebElement timeCalender;
	
	@FindBy (css = "input[name = "dt-inline-edit-currency"]")
	private WebElement balanceTextBox;
	
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) lightning-base-formatted-text")
	private WebElement nameDisplayed;
	
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) lightning-formatted-url > a")
	private WebElement urlDisplayed;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) lightning-formatted-phone > a")
	private WebElement phoneNoDisplayed;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) lightning-formatted-date-time")
	private WebElement dateDisplayed;
	
	@FindBy (css = "div > div.slds-scrollable_y tbody > tr:nth-of-type(3) lightning-formatted-number")
	private WebElement amountDisplayed;
	
	
	public void clickComponentReferenceTab(){
		componentReference.click();
	}
	
	public boolean isComponentReferencePageDisplayed(){
		componentReferencePage.isDisplayed();
	}
	
	public void sendKeysInQuickFind(String search){
		quickFind.sendKeys(search);
	}
	
	public void clickDatatableOption(){
		datatable.click();
	}
	
	public WebElement getDropdown(){
		return exampleDropdown;
	}
	
	 public void dropdownSelect(String dropdownOption){
		 Select select = new Select(exampleDropdown);
		 select.selectByVisibleText(dropdownOption);
	 }
	 
	 
	 
	
	 public void clickRunButton(){
		 runButton.click();
	 }
	 
	 public void editThirdRowName(){
		 pencilThirdRowName.click();
	 }
	 
	 public void editThirdRowLink(){
		 pencilThirdRowLink.click();
	 }
	 
	 public void editThirdRowPhoneNo(){
		 pencilThirdRowPhoneNo.click();
	 }
	 
	 public void editThirdRowDate(){
		 pencilThirdRowDate.click();
	 }
	 
	 public void editThirdRowAmount(){
		 pencilThirdRowAmount.click();
	 }
	
	 public void sendKeysNameTextBox(String name){
			nameTextBox.sendKeys(name);
			nameTextBox.sendKeys(Keys.TAB);
		}
	 
	 public void sendKeysUrlTextBox(String url){
			urlTextBox.sendKeys(url);
			urlTextBox.sendKeys(Keys.TAB);
		}
	 
	 public void sendKeysPhoneNoTextBox(String phoneNo){
		 	phoneNoTextBox.sendKeys(phoneNo);
		 	phoneNoTextBox.sendKeys(Keys.TAB);
		}
	 
	 public void clickThirdRowDateCalender(){
		 dateCalender.click();
	 }
	 
	 public void sendKeysTimeCalenderTextBox(String time){
		 	timeCalender.sendKeys(time);
		 	timeCalender.sendKeys(Keys.TAB);
	}
	 
	 public void sendKeysBalanceTextBox(String amount){
		 	balanceTextBox.sendKeys(amount);
		 	timeCalender.sendKeys(Keys.TAB);
	 }
	 
	 public String getnameDisplayed(){
		 return nameDisplayed.getText();
	 }
	 
	 public String getUrlDisplayed(){
		 return urlDisplayed.getText();
	 }
	 
	 public String getPhoneNoDisplayed(){
		 return phoneNoDisplayed.getText();
	 }
	 
	 public String getDateDisplayed(){
		 return dateDisplayed.getText();
	 }
	 
	 public String getAmountDisplayed(){
		 return amountDisplayed.getText();
	 }
	 
	 
	 
	 
	 //wait for the example tab to be displayed
	 public void waitForExampleElement(){
		 waitOnPage().until(ExpectedConditions.visibilityOfElementLocated(exampleElement));
	 }
	 
	 public void scrollIntoViewOfPreview(){
	 	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 	jse.ExecuteScript("arguments[0].scrollIntoView();", previewElement);
	 }
	 
	//wait for the third row in preview to be displayed
		 public void waitForThirdRowInTable(){
			 waitOnPage().until(ExpectedConditions.visibilityOfElementLocated(thirdRow));
		 }
}
