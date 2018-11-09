import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class RunApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		File f = new File("D:\\Softedge\\Java\\AssignmentDemo\\Data1.xml");
		Document doc = builder.parse(f);
		XPath xPath = XPathFactory.newInstance().newXPath();

		String expression = "/TestAssignment/NewUserInfo/FirstName";
		NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		System.out.println(nodeList.item(0).getTextContent());
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		NewtoursHome home = PageFactory.initElements(driver, NewtoursHome.class);
		home.Click();
		
		NewtoursRegistration register = PageFactory.initElements(driver, NewtoursRegistration.class);
		register.EnterFirstName("Hardik");
		register.EnterLastNameName("Hardik");
*/	}
}
