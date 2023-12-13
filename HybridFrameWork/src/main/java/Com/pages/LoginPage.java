package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver lpdriver= null;
	
	public LoginPage (WebDriver driver) {
		this.lpdriver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//button")
	WebElement loginbtn;
	
	public void LoginApplication(String Uname,String Pass) {
		username.sendKeys(Uname);
		password.sendKeys(Pass);
		loginbtn.click();
		
	}
	public DashboardPage Validlogin() {
		
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbtn.click();

		return new DashboardPage(lpdriver);
		
	}

}
