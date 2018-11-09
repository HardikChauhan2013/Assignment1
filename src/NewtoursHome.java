import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHome {
 

	@FindBy(xpath = ".//a[text()='REGISTER']")
	WebElement RegisterLink;


	public void Click() {
		RegisterLink.click(); 
	}
}
