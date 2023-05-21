package stepdefs;

import java.util.List;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculatorstepdefs {
	
	int num1;
	int num2;
	int result=0;
	List<Integer> values;
	

	
	//this is what we write calcultor.featur file
	@Given("I have two numbers {int} and {int}")
	
	//this var1 and var2 in our give keyword
	public void i_have_two_numbers_and(int var1, int var2) {
	    // Write code here that turns the phrase above into concrete actions
		this.num1 = var1;
		this.num2 = var2;
	}
	
	
	//this is what we write calcultor.featur file
	@When("I add those two numbers")
	public void i_add_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		result = num1+num2;
	}

	
	//this is what we write calcultor.featur file
	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expResult, result);
	}

	
	//this is what we write calcultor.featur file
	@When("I sub those two numbers")
	public void i_sub_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		result = num1-num2;
	}
	
	@Given("I have below numbers")
	public void i_have_below_numbers(List<Integer> dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    this.values = dataTable;
	}

	@When("I add those numbers")
	public void i_add_those_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	   for(int num:values) {
		   result = result+num;
	   }
	}

	

	
}
