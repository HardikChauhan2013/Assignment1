import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 

public class NewtoursRegistration {
	@FindBy(xpath = ".//input[@name='firstName']")
	WebElement FirstName;

	@FindBy(xpath = ".//input[@name='lastName']")
	WebElement LastName;
	
	public void EnterFirstName(String value) {
		FirstName.clear();
		FirstName.sendKeys(value);
	}

	public void EnterLastName(String value) {
		LastName.clear();
		LastName.sendKeys(value);
	}
}
