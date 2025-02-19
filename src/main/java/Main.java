import static io.restassured.RestAssured.when;

public class Main {
    public static void main(String[] args) {
        final String URL_ONLINER_MAIN = "https://www.onliner.by/";

        when()
                .get(URL_ONLINER_MAIN)
                .then()
                .statusCode(400);
    }
}
