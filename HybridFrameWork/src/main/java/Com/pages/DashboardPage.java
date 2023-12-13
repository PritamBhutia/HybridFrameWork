package Com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver dpdriver= null;
	public DashboardPage(WebDriver driver) {
		this.dpdriver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath="//h3")
	List<WebElement>cources;
	public ArrayList<String>Verifycource(){
		ArrayList<String>ActualCource= new ArrayList<String>();
		for (WebElement cource : cources) {
			String text=cource.getText();
			ActualCource.add(text);
		}
		return ActualCource;
		
	}
	public boolean Verifycource1() {
	
			ArrayList<String>ActualCource= new ArrayList<String>();
			for (WebElement cource : cources) {
				String text=cource.getText();
				ActualCource.add(text);
		
		
	}
			ArrayList<String>ExcepetedCource= new ArrayList<String>();
			ExcepetedCource.add("Selenium");
			ExcepetedCource.add("Java / J2EE");
			ExcepetedCource.add("Python");
			ExcepetedCource.add("Php");
			if(ActualCource.equals(ExcepetedCource))
			return true;
			else
				
			return false;
	
	}
}
