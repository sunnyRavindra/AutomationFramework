package rest.automation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;

public class RestAssuredAutomation {
	String SessionID;

	@Test
	public void postBook() throws IOException {

		//Variables 
		baseURI = "http://localhost";
		port = 8080;

		//Cookie authentication 
		//Post
		//File path
		String authenticationRequestFile = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")
				+ "/src/resource/Authentication.json")));

		Response authenticationResponse = given().log().all().contentType("application/json").body(authenticationRequestFile)
				.post("rest/auth/1/session");

		//Response
		authenticationResponse.then().log().all().statusCode(200).body("session.name", equalTo("JSESSIONID"));
		
		JsonPath refactoreJsonPath = new JsonPath(authenticationResponse.asString());
		
		SessionID = refactoreJsonPath.get("session.value");
		
		//Create Issue 
		//POST
		String createIssueBody = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/src/resource/CreateIssue.json")));
		
		Response CreateIssueResponse = given().log().all().queryParam("updateHistory", "true").contentType("application/json").header("cookie","JSESSIONID="+SessionID).body(createIssueBody).when().log().all().post("/rest/api/2/issue");
		
		CreateIssueResponse.then().log().all().statusCode(201);
		
		JsonPath CreateIssueJsonPath = new JsonPath(CreateIssueResponse.asString());
		
		int issueID = CreateIssueJsonPath.getInt("id");
		
		//Get All Issues
		//Get
		given().log().all().header("cookie","JSESSIONID="+SessionID).when().log().all().get("/rest/api/2/issue/"+issueID).then().log().all().statusCode(200);

//		String string1 = new String(
//				Files.readAllBytes(Paths.get(System.getProperty("user.dir" + "//src//resource/request.json"))));

//		Response responsePost = given().header("Content-Type", "application/json")
//				.body(new String(
//						Files.readAllBytes(Paths.get(System.getProperty("user.dir" + "//src//resource/request.json")))))
//				.when().post("Library/Addbook.php");
//
//		responsePost.then().statusCode(200);
//
//		String responseString = responsePost.asString();
//		Headers headers = responsePost.headers();
////		System.out.println(headers);
////		System.err.println(responsePost.getStatusLine());
//		JsonPath jsonPath = new JsonPath(responseString);
//		ID = jsonPath.get("ID");
//		System.out.println(jsonPath.get("msg"));
//	}
//
//	@Test(dependsOnMethods = "postBook")
//	public void deleteBook() {
//		Response deleteResponse = given().contentType("application/json")
//				.body("{\n" + "\"ID\" : \"" + ID + "\"\n" + "} ").when().post("/Library/DeleteBook.php");
//
////		deleteResponse.then().statusCode(200);
//
//		System.out.println(deleteResponse.asPrettyString());

	}

}
