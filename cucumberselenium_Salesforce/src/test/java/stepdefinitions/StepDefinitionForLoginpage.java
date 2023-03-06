package stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Salesforce_factory.DriverFactory;
import com.steps.Forgot_passwordpage;
import com.steps.Homepage;
import com.steps.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitionForLoginpage {
	
	private Loginpage lp = new Loginpage(DriverFactory.getDriver());
    private Homepage hp = new Homepage(DriverFactory.getDriver());
    private Forgot_passwordpage fp = new Forgot_passwordpage(DriverFactory.getDriver());
    
	
	@Given("application is up and running and in loginpage")
	public void application_is_up_and_running_and_in_loginpage() {
		
	    DriverFactory.getDriver().get("https://login.salesforce.com/");
	}

	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
	    lp.clickLoginbtn();
	}

	 @When("user enters username {string}")
	 public void user_enters_username(String username) throws InterruptedException {
	    lp.enterUserName(username);
	    
	 }
	 @Then("user should get the new home page")
	 public void user_should_get_the_new_home_page() {
		
	 }
	 @When("user enters password {string}")
	 public void user_enters_password(String password) throws InterruptedException {
	     lp.enterPassword(password);
	   
	 }

	 @Then("check the title of the page {string}")
	 public void check_the_title_of_the_homepage(String string) {
		 String expected ="Salesforce - Essentials Edition";
	String actual =  DriverFactory.getDriver().getTitle();
	
	Assert.assertEquals(actual, expected);
	    
	 }
	 @When("user enters null password {string}")
	 public void user_enters_null_password(String npass) throws InterruptedException {
	   lp.enternullPassword(npass);
	 }

	 @Then("Error message get displayed")
	 public void error_message_get_displayed() {
		 String expected = "Please enter your password.";
	     String actual =lp.get_error_message();
	     Assert.assertEquals(actual, expected);
	 }

	 @Then("Remember me checkbox checked")
	 public void remember_me_checkbox_checked() throws InterruptedException {
	   lp.selectCheckbox();
	 }

	 @Then("Logout from the application")
	 public void logout_from_the_application() throws InterruptedException {
	     hp.logoutfromapp();
	 }

	 @Then("check usename field for username")
	 public void check_usename_field_for_username() {
		
	   String userfield= lp.getUsenamefieldText();
	   System.out.println(userfield);
	  
	 }
	 @When("click on the Forgot ypur password link")
	 public void click_on_the_forgot_ypur_password_link() throws InterruptedException {
	     lp.clickForgotPassword();
	 }

	 @Then("user should get the forgot your password page")
	 public void user_should_get_the_forgot_your_password_page() {
		 String expected ="Forgot Your Password | Salesforce";
			String actual =  DriverFactory.getDriver().getTitle();
			 System.out.println(actual);
			Assert.assertEquals(actual, expected);
	 }
	 @Then("user provides username {string}")
	 public void user_provides_username(String funame) throws InterruptedException {
	     fp.provideUsername(funame);
	 }
	 
	 @When("user provides invalid username {string}")
	 public void user_provides_invalid_username(String inuser) throws InterruptedException {
	    lp.enterInvalidUserName(inuser);
	 }

	 @When("user provides invalid password {string}")
	 public void user_provides_invalid_password(String inpass) throws InterruptedException {
	    lp.enterinvalidPassword(inpass);
	 }

	 @Then("error message displayed in the loginpage")
	 public void error_message_displayed_in_the_loginpage() {
	    
	     String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	     String actual =lp.get_error_message();
	     Assert.assertEquals(actual, expected);
	     
	 }


	
	


}
