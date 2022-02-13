package features;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.api.driver.Driver;
public class getProductTest  extends Driver{
	
   @Test
   public void getProducts()
   {  //  String payload="{\"name\":\"jmd\",\"type\":\"maa\",\"price\":100000000000,\"shipping\":100000000,\"upc\":\"knk\",\"description\":\"abc\",\"manufacturer\":\"pqr\",\"model\":\"stv\",\"url\":\"amama\",\"image\":\"smmammatring\"}";
		/*
		 * String response =given().header("Content-Type", "application/json").
		 * body(payload).when().post("/products").
		 * then().assertThat().statusCode(201).extract().response().asString();
		 */
	 //  System.out.println(response);
	   
	   given().header("Content-Type", "application/json").when().get("/products").then().assertThat().statusCode(200);
		
	   
   }

}
