package core;

import config.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static RequestSpecification requestSpec;

    @BeforeClass
    public void setup() {

        requestSpec = new RequestSpecBuilder()
                .setBaseUri(ConfigManager.getBaseUrl())
                .addHeader("Authorization", "Bearer " + ConfigManager.getToken())
                .addHeader("Accept", "application/json")
                .build();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
