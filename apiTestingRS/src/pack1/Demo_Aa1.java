package pack1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class Demo_Aa1 {

	public static void main(String[] args) {
	//Provide Base URL or the Host
			RestAssured.baseURI="https://maps.googleapis.com/maps";
			
			given().param("input", "Museum%20of%20Contemporary%20Art%20Australia")
			.param("inputtype", "textquery").param("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
			.param("key", "AIzaSyAbAQAKqsBp3-sqMBFUr-smRnXf1nGf8KM").when().get("/maps/api/place/findplacefromtext/json?").then().assertThat().statusCode(200);


	}

}
