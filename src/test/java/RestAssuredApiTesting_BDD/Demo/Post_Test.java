package RestAssuredApiTesting_BDD.Demo;

import org.testng.annotations.Test;

import com.capgemini.BDD_TEST.Model.Product;

import static io.restassured.RestAssured.*;

public class Post_Test {

      Product product; 
	
	@Test
	public void addProductTest()
	{
		given()
		   .contentType("application/json")
		   .body(new Product(6,"cycle"))
		  .when()
		     .post("http://localhost:8080/addProduct")
		  .then()
		    .statusCode(200)
		    .header("Content-Type","text/plain;charset=UTF-8");
		
	}
	
	
}
