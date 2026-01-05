package negative;

import clients.UserClient;
import core.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeUserTest extends BaseTest {

    @Test
    public void invalidUserIdShouldReturn404() {

        int nonExistingUserId = 999999999; // VALID but non-existent

        Response res = UserClient.getUser(nonExistingUserId);
        Assert.assertEquals(res.statusCode(), 404);
    }
}
