import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class OnlinerTest {
    @Test
    @DisplayName("Get home page onliner")
    public void getHomePageOnliner() {
        final String URL_ONLINER_MAIN = "https://www.onliner.by/";

        when()
                .get(URL_ONLINER_MAIN)
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void testLoginOnliner() {
        final String body = "{\"login\": \"john\", \"password\": \"123\"}";
        final String URL_ONLINER_LOGIN = "https://www.onliner.by/sdapi/user.api/login";
        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(body)
                .when()
                .post(URL_ONLINER_LOGIN)
                .then()
                .log()
                .all()
                .statusCode(428);
    }

    @Test
    @DisplayName("Get home page 5element")
    public void getHomePageTheFifthElement() {
        final String URL_THE_FIFTH_ELEMENT_MAIN = "https://5element.by/";

        when()
                .get(URL_THE_FIFTH_ELEMENT_MAIN)
                .then()
                .log().all()
                .statusCode(200);
    }
}
