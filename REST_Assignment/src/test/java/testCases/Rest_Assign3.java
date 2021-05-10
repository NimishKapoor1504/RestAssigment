package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assign3 {
	Response response;
	@Given("An incomplete API is given")
	public void an_incomplete_api_is_given() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/");
	}

	@When("API is available third")
	public void api_is_available_third() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==400);
	}

	@Then("Assert status of the response third")
	public void assert_status_of_the_response_third() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Its a bad request");
	    String s1= "{\"error\":\"time data 'api' does not match format '%Y-%m-%d'\"}";
	    String s2 = response.getBody().asString();
	    assertEquals(s1, s2);
	}
}
