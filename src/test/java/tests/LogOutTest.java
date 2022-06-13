package tests;


import org.testng.Assert;
import org.testng.annotations.Test;





public class LogOutTest extends BaseLoginTest {

	//MainPage mp;
	@Test
	public void logOutTest() {
		Assert.assertTrue(mp.logout().equals("Sign in"));
	}
}
