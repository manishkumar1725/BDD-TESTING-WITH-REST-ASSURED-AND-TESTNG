package RestAssuredApiTesting_BDD.Demo;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;

public class Get_Test {
	
	@Test
	public void getProductTest()
	{
		given()
		  .when()
		     .get("http://localhost:8080/getProduct/1")
		  .then()
		    .statusCode(200)
		    .assertThat().body("id",equalTo(1))
		    .header("Content-Type","application/json;charset=UTF-8");
	}


}
