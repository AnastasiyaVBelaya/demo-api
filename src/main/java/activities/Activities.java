package activities;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Activities extends Base {

    private static final String ACTIVITIES_URL = BASE_URL + "/Activities";

    public static Response doDeleteRequest() {
        String url = ACTIVITIES_URL + "/0";
        Response response = given()
                .header("accept", "*/*")
                .when()
                .delete(url);
        return response;
    }

    public static Response doGetRequest() {
        String url = ACTIVITIES_URL;
        Response response = given()
                .header("accept", "text/plain; v=1.0")
                .when()
                .get(url);
        return response;
    }

    public static Response getPostResponse() {
        String url = ACTIVITIES_URL;
        ActivityBody activityBody = new ActivityBody(1000000,"hello","2025-02-19T16:17:38.563Z",true);
        Response response = given()
                .headers(getHeaders())
                .body(activityBody)
                .when()
                .post(url);
        return response;
    }

    public static Response getPutResponse() {
        String url = ACTIVITIES_URL + "/0";
        ActivityBody activityBody = new ActivityBody(0,"java","2025-02-19T16:29:22.730Z",false);
        Response response = given()
                .headers(getHeaders())
                .body(activityBody)
                .when()
                .put(url);
        return response;
    }

    private static Map<String, Object> getHeaders() {
        Map<String, Object> headers = new HashMap<>();
        headers.put("accept", "text/plain; v=1.0");
        headers.put("Content-Type", "application/json");
        return headers;
    }
}
