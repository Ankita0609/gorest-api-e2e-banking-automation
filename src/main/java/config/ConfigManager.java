package config;

public class ConfigManager {

    private static final String BASE_URL = "https://gorest.co.in/public/v2";

    /**
     * Base URL for all API calls
     */
    public static String getBaseUrl() {
        return BASE_URL;
    }

    /**
     * Reads token from environment variable
     * Required for local + Jenkins execution
     */
    public static String getToken() {
        String token = System.getenv("GOREST_TOKEN");

        if (token == null || token.isEmpty()) {
            throw new RuntimeException(
                    "❌ GOREST_TOKEN environment variable is NOT set\n" +
                    "👉 Set it before running tests"
            );
        }
        return token;
    }
}
