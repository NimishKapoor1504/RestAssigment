package testCases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class Rest_Assign1 {
	Response response;
	@Given("An API is given")
	public void an_api_is_given() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/latest");
	}

	@When("API is availabale")
	public void api_is_availabale() {
	    // Write code here that turns the phrase above into concrete actions
		String responseBody = response.getBody().asString();
		assertFalse(responseBody.isEmpty());
		
	}

	@Then("Assert status response")
	public void assert_status_response() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==200);
	}

}
