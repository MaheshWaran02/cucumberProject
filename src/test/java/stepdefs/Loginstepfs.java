package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepfs {
WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
	}

	@Given("I have clicked on Login Link")
	public void i_have_clicked_on_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Username = driver.findElement(By.name("user_login"));   
		Username.sendKeys("abc@xyz.com");
		
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123@Abcd");
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginbuttonLink = driver.findElement(By.name("btn_login"));
		LoginbuttonLink.click();
	}

	@Then("I shoud land on home page")
	public void i_shoud_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I shoud get the error message")
	public void i_shoud_get_the_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//div[@class='error_msg']"));
		String actual_error = error.getText();
		String expected_error = "The email or password you have entered is invalid.";
		Assert.assertEquals(actual_error, expected_error);
	}


	@When("I enter username is {string}")
	public void i_enter_username_is(String UsernameVal) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement Username = driver.findElement(By.name("user_login"));   
		Username.sendKeys(UsernameVal);
		
	}

	@When("I enter password is {string}")
	public void i_enter_password_is(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(PassVal);
	}

	@Then("I shoud get the error message is {string}")
	public void i_shoud_get_the_error_message_is(String EXPerrorVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//div[@class='error_msg']"));
		String actual_error = error.getText();
		Assert.assertEquals(actual_error, EXPerrorVal);
	}


	
	
}
