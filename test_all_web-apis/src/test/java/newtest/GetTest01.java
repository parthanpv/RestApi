package newtest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest01 {
	
	@Test
	void test_01()
	{
		Response res= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		//System.out.println(res.getBody().asPrettyString());
		
	}

}
