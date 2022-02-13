package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import com.api.driver.Driver;
import com.api.driver.RALogger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import gherkin.formatter.Reporter;



public class GetStepDefination extends Driver {
	
	 RequestSpecification req;
	 Response res;
	ExtentReports reporter;
	ExtentTest test;
	ExtentHtmlReporter sp;
	@Given("Get Product details using get API")
	public void get_product_details_using_get_api() {
	    // Write code here that turns the phrase above into concrete actions
       setup();
	  req = new RequestSpecBuilder().addHeader("Content-type", "application/json").build();
	  sp=new ExtentHtmlReporter("D:\\photoshoot_gaurav\\Airtel\\api_project\\Api\\target\\cucumber-reports\\advanced-reports\\extent-reports\\extent.html");
	  reporter=new ExtentReports();
	  reporter.attachReporter(sp);
	  test= reporter.createTest("Get Api");
	  test.log(Status.INFO, "I am in actual Test");
	 
	  
	}

	@When("User header and cookies to get valid response")
	public void user_header_and_cookies_to_get_valid_response() {
	    // Write code here that turns the phrase above into concrete actions
		res=given().filters( new RALogger.LogFilter()).spec(req).when().get("/products");
		test.log(Status.INFO, "I am in actual Test");
		test.log(Status.INFO, "I am in actual Test");
		test.log(Status.INFO, "I am in actual Test");
	    
	}

	@Then("Validate status code as {int}")
	public void validate_status_code_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	 String response= res.then().assertThat().statusCode(int1).extract().response().asString();
	 test.log(Status.INFO, "I am in actual Test");
     
	}

}
