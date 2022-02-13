package com.api.driver;



import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;





//RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
//RestAssured.baseURI="http://localhost:3030/";
public class Driver{

 public void setup()
 {
	 RestAssured.baseURI="http://localhost:3030/";
	 RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
	 
 }
}