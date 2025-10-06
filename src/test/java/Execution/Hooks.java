package Execution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.DriverFactory;
import pages.Utility_class;

public class Hooks 
{
	
	WebDriver driver;
	@Before
	public void openbrowser() throws IOException
	{
		DriverFactory df=new DriverFactory();
		String browsername = Utility_class.property("browsername");
		driver = df.initbrowser(browsername);
	}
	
	@After
	public void closebrowser()
	{
		driver.quit();
	}

}
