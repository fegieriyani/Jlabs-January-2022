package qaautomation.tugasqajlabs2022;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	
	@Test
	public void registerAPI() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String registerPayload = "{\"username\": \"leeann.howe\", \"password\": \"password123\", \"email\": \"testchoco123@gmail.com\", \"phonenumber\": \"108-825-4325\"}";
		Response response = RestAssured.given().contentType("application/json").body(registerPayload).when().post("/register");
		int statusCode = response.getStatusCode();
	}
	
	@Test
	public void fakerTest() {
		Faker faker = new Faker();
		System.out.println(faker.phoneNumber().cellPhone());
		System.out.println(faker.name().username());
		}
}
