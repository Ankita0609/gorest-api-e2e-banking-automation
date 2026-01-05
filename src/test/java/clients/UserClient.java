package clients;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static core.BaseTest.requestSpec;

public class UserClient {

    public static Response createUser(String email) {

        String body = "{"
                + "\"name\":\"Ankita Test\","
                + "\"email\":\"" + email + "\","
                + "\"gender\":\"female\","
                + "\"status\":\"active\""
                + "}";

        return given()
                .spec(requestSpec)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/users");
    }

    public static Response getUser(int userId) {
        return given()
                .spec(requestSpec)
                .when()
                .get("/users/" + userId);
    }

    public static Response deleteUser(int userId) {
        return given()
                .spec(requestSpec)
                .when()
                .delete("/users/" + userId);
    }
}
