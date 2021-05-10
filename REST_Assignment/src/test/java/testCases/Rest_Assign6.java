package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assign6 {
Response response,response1;
String url1,url2;
@Given("API for a specific date is provided")
public void api_for_a_specific_date_is_provided() {
    // Write code here that turns the phrase above into concrete actions
	url1="https://api.ratesapi.io/api/2022-05-01";
	url2="https://api.ratesapi.io/api/latest";

}

@When("given API is availabale")
public void given_api_is_availabale() {
    // Write code here that turns the phrase above into concrete actions
	response = RestAssured.get(url1);
	response1 = RestAssured.get(url2);
}

@Then("Validate the response as current date response")
public void validate_the_response_as_current_date_response() {
    // Write code here that turns the phrase above into concrete actions
	int code= response.getStatusCode();
	assertTrue(code==200);
    assertEquals(response.getBody().asString(),response.getBody().asString());
	}


}
