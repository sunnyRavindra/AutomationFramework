package rest.automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class WithoutBDD {

	static RequestSpecification requestSpecification;
	static Response response;
	static ValidatableResponse validatableResponse;

	@Test
	public void oldMethodOfRestAssured() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";

		// Create a request specification
		requestSpecification = RestAssured.given();

		// Calling GET method
		response = requestSpecification.get();

		// Let's print response body.
		System.out.println(response.prettyPrint());

		// Validate Response
		validatableResponse = response.then();

		// Get status code
		validatableResponse.statusCode(200);

		// Check status line is as expected
		validatableResponse.statusLine("HTTP/1.1 200 OK");
	}

    @Test
    public void oldMethodOfRestAssuredUsingTestNG() {
 
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
 
        // Create a request specification
        requestSpecification = RestAssured.given();
 
        // Calling GET method
        response = requestSpecification.get();
 
        // Let's print response body.
		System.out.println(response.prettyPrint());
 
        // Get status line
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
 
        // Get status code
        Assert.assertEquals(response.getStatusCode(), 200);
 
    }
}
