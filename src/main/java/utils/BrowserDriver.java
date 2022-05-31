package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.ChromeOptions;

public class BrowserDriver {
	
	private static WebDriver driver;
	
	public WebDriver  initDriver(){
		ChromeOptions options = new ChromeOptions();
		options.addArgument("start-maximized", "--incognito", "--window-position=0,0");
		return new ChromeDriver(options);
	}
	
	public static WebDriver getDriver(){
		driver.get(driverbaseurl);
		
	}
	
}
