package Com.Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.pages.DashboardPage;
import Com.pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage lp= null;
	DashboardPage dp = null;
	@BeforeSuite
	public void SetUp()throws Exception {
		Initialization();
		ExtentInit();
		lp = new LoginPage(driver);
	}
	@Test
	public void Test01() {
		dp= lp.Validlogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
    public void Test02() {
    	Assert.assertTrue(dp.Verifycource1());
    }
	@Test
	
	public void Test03() {
		throw new SkipException("null");
		
	}
	@Test
	public void Test04() {
		Assert.assertTrue(false);
	}
}
