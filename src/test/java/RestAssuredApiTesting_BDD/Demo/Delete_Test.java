package RestAssuredApiTesting_BDD.Demo;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Delete_Test {

	
	@Test
	public void deleteProductTest()
	{
		given()
		  .when()
		     .delete("http://localhost:8080/deleteProduct/3")
		  .then()
		    .statusCode(200)
		    .header("Content-Length","0");
	}
}
