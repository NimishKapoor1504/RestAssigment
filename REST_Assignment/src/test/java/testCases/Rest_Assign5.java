package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assign5 {
	Response response;
String url;
	
	@Given("An API is given for a date fifth")
	public void an_api_is_given_for_a_date_fifth() {
	    // Write code here that turns the phrase above into concrete actions
	   url="https://api.ratesapi.io/api/2021-05-06";
	}

	@When("API is available fifth")
	public void api_is_available_fifth() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/2021-05-06");
	}

	@Then("Assert the response fifth")
	public void assert_the_response_fifth() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==200);
		assertTrue(response.getBody().asString().contains("2021-05-06"));
	}
}
