package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assign2 {
	Response response;
	@Given("An API is given two")
	public void an_api_is_given_two() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("https://api.ratesapi.io/api/latest");
	}
	@When("given API is available two")
	public void given_api_is_available_two() {
	    // Write code here that turns the phrase above into concrete actions
		int code= response.getStatusCode();
		assertTrue(code==200);
	}

	@Then("Assert the response two")
	public void assert_the_response_two() {
	    // Write code here that turns the phrase above into concrete actions
	    String s1 = response.getBody().asString();
	    String s2 = "{\"base\":\"EUR\",\"rates\":{\"GBP\":0.8681,\"HKD\":9.3661,\"IDR\":17208.37,\"ILS\":3.9438,\"DKK\":7.4361,\"INR\":88.6375,\"CHF\":1.0963,\"MXN\":24.2006,\"CZK\":25.682,\"SGD\":1.6061,\"THB\":37.588,\"HRK\":7.5345,\"MYR\":4.9587,\"NOK\":10.0125,\"CNY\":7.7809,\"BGN\":1.9558,\"PHP\":57.747,\"SEK\":10.1263,\"PLN\":4.5754,\"ZAR\":17.1863,\"CAD\":1.4689,\"ISK\":150.5,\"BRL\":6.3801,\"RON\":4.9265,\"NZD\":1.673,\"TRY\":10.0019,\"JPY\":131.76,\"RUB\":89.4671,\"KRW\":1350.52,\"USD\":1.2059,\"HUF\":358.01,\"AUD\":1.5523},\"date\":\"2021-05-07\"}";
	    assertEquals(s1, s2);
	}

}
