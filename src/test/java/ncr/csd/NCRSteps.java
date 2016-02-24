package ncr.csd;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NCRSteps extends TestCase{
	private WebDriver driver = new FirefoxDriver();;
	private String baseUrl = "https://www.google.co.in/";
	
	@Given("^User enter \"([^\"]*)\" in search box$")
	public void User_enter_in_search_box(String searchParam) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	driver.get(baseUrl); // + "/?gfe_rd=cr&ei=NObKVsaSKIjI8AfYh7egDw&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys(searchParam);
	}

	@When("^click on search$")
	public void click_on_search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.name("btnG")).submit();
	}

	@Then("^Result should be more than \"([^\"]*)\"$")
	public void Result_should_be_more_than(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("resultStats")).getAttribute("text");
		assertEquals(arg1, result);
	}
}
