package e2e;

import clients.UserClient;
import core.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class GoRestE2ETest extends BaseTest {

    @Test
    public void userLifecycleE2E() {

        String email = "ankita_" + UUID.randomUUID() + "@gmail.com";

        // 1️⃣ Create user
        Response createRes = UserClient.createUser(email);
        Assert.assertEquals(createRes.statusCode(), 201);

        int userId = createRes.jsonPath().getInt("id");
        Assert.assertTrue(userId > 0);

        // 2️⃣ Get user
        Response getRes = UserClient.getUser(userId);
        Assert.assertEquals(getRes.statusCode(), 200);

        // 3️⃣ Delete user
        Response deleteRes = UserClient.deleteUser(userId);
        Assert.assertEquals(deleteRes.statusCode(), 204);
    }
}
