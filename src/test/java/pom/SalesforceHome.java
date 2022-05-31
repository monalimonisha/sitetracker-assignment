package pom;


public class SalesforceHome extends BaseTest {
	
	public SalesforceHome (WebDriver driver){
		super (webDriver);
		this.driver = driver;
		PageFactory.initElement(webDriver, this);
	}
	
	@FindBy (css = "span.slds-truncate")
	private WebElement componentReference;
	
	@FindBy (css = "input#input-64")
	private WebElement quickFind;
	
	@FindBy (css = "span[title="datatable"]")
	private WebElement datatable;
	
	@FindBy (css = "button[aria-controls="dropdown-element-390"]")
	private WebElement exampleDropdown;
	
	@FindBy (css = "lightning-button > button[class="slds-button slds-button_neutral"] > lightning-primitive-icon")
	private WebElement runButton;
	
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
	
	@FindBy ( id = "input-1934")
	private WebElement nameTextBox;
	
	@FindBy (id = "input-1937")
	private WebElement urlTextBox;
	
	@FindBy (id = "input-1939")
	private WebElement phoneNoTextBox;
	
	@FindBy (id = "input-1943")
	private WebElement dateCalender;
	
	
	public WebElement getComponentReference(){
		return componentReference;
	}
	
	public WebElement getQuickFind(){
		return quickFind;
	}
	
	public WebElement getDatatable(){
		return datatable;
	}
	
	public WebElement getDropdown(){
		return exampleDropdown;
	}
	
	 public void dropdown(){
		 Select select = new Select(exampleDropdown);
		 select.selectByVisibleText("Data Table with Inline Edit");
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
	
	 public WebElement getNameTextBox(){
			return nameTextBox;
		}
	 
	 public WebElement getUrlTextBox(){
			return urlTextBox;
		}
	 
	 public WebElement getPhoneNoTextBox(){
			return phoneNoTextBox;
		}
	 
	 
}
