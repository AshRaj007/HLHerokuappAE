import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class APITest {


    @Test
    public void postUserToReqRes() {
        JSONObject request = new JSONObject();

        request.put("name", "Ashika");
        request.put("job", "Senior Automation Tester");
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).
                log().all();

    }

    @Test
    public void getUserFromReqRes() {

        given().
                get("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                body("data.first_name", equalTo("Janet")).
                log().all();


    }

    @Test
    public void updateUserOnReqRes() {

        JSONObject request = new JSONObject();

        request.put("name", "Ash Raj");
        request.put("job", "Interior Designer");
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();

    }


    @Test
    public void deleteUserfromReqRes() {

        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();

    }
}

