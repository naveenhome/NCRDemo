package ncr.csd;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{

	QuickPost quickPost = new QuickPost();
	String actionButton;
	@Given("^Employee enter valid quick post data$")
	public void Employee_enter_valid_quick_post_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		quickPost.setfName("Naveen");
		quickPost.setlName("Singh");
		quickPost.setEmail("naveen.singh@leanpitch.com");
		quickPost.setPhone("9810547500");
		quickPost.setOrigin("Office");
		quickPost.setDesti("Huda City Center");
		quickPost.setTime("5.30pm");
	}

	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton=arg1;
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void System_display_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		QuickPostBLL obj = new QuickPostBLL();
		assertEquals(arg1, obj.validate(quickPost));
	}

	@Then("^Clear all fields$")
	public void Clear_all_fields() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^Employee enter Invalid Email id$")
	public void Employee_enter_Invalid_Email_id() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
