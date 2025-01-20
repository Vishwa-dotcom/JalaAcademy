package cucumberStepDefinition;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.loginPageM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageTest extends BaseTest {

	@Given("User is on Login Page")
	public void user_is_on_login_page() throws Exception {
		BaseTest.WebDriverSetup();
		loginPageM.clickLogOutButton();
		loginPageM.jalaAcademyPage();

	}

	@When("User Validates the all the elements available on Login Page")
	public void user_validates_the_all_the_elements_available_on_login_page() {
		loginPageM.validateAllElementsfromLoginPage();
	}

	@And("Login to the application")
	public void login_to_the_application() {
		loginPageM.enterUserName("training@jalaacademy.com");
		loginPageM.enterPassword("jobprogram");
		loginPageM.clickLoginButton();
		
	}

	@Then("User should login to application successfully")
	public void user_should_login_to_application_successfully() {
		loginPageM.jalaWelcomePage();
		loginPageM.clickLogOutButton();
		BaseTest.closeEntireBrowser();
	}

}
