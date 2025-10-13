package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;
	public WebDriver initbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			 driver =new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		return driver;
		
	}

	public static WebDriver getdriver()
	{
		return driver;
	}
}
