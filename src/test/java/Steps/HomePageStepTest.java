package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;


public class HomePageStepTest extends BaseClass {

	@When("user is on home page and validate title")
	public void user_is_on_home_page_and_validate_title() 
	{
		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}

	@When("user is on home page and validate url")
	public void user_is_on_home_page_and_validate_url() 
	{
		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}
}
