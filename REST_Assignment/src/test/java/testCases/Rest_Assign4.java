package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assign4 {
	Response response;
	@Given("An API is given for a date")
	public void an_api_is_given_for_a_date() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/2021-05-06");
	}

	@When("API is available")
	public void api_is_available() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==200);
	}

	@Then("Assert status of the response")
	public void assert_status_of_the_response() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==200);
	}
}
