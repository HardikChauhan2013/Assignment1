import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.w3c.dom.*;

public class TestNGDemo {

	
	
    @Parameters({"dataxmlfilePath","browserName"})
	@Test
	public void FillFormTestCase(String dataxmlfilePath, String browserName) throws Exception {
  		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
  		System.setProperty("webdriver.firfox.driver", "");
  		System.setProperty("webdriver.internetexplorer.driver", "");
  		WebDriver driver;
  		
  		if(browserName.equalsIgnoreCase("ie"))
  			driver= new InternetExplorerDriver();
  		else if(browserName.equalsIgnoreCase("firfox"))
  			driver = new FirefoxDriver();
  		else 
  			driver = new ChromeDriver();
  		
		driver.get("http://newtours.demoaut.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		NewtoursHome home = PageFactory.initElements(driver, NewtoursHome.class);
		home.Click();

		MyXMLDataProvider xmlReaderObj = new MyXMLDataProvider(dataxmlfilePath);
		
		NewtoursRegistration register = PageFactory.initElements(driver, NewtoursRegistration.class);
		register.EnterFirstName(xmlReaderObj.Read("/TestAssignment/NewUserInfo/FirstName"));
		register.EnterLastName(xmlReaderObj.Read("/TestAssignment/NewUserInfo/LastName"));

	}
}
