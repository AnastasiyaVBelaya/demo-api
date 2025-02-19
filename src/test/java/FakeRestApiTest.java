import activities.Activities;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FakeRestApiTest {

    @Test
    @DisplayName("Get activities")
    public void getActivitiesTest() {
        Response response = Activities.doGetRequest();

        response.then()
                .log().all()
                .statusCode(200);
    }

    @Test
    @DisplayName("POST Activities")
    public void postActivitiesTest() {
        Response response = Activities.getPostResponse();

        response.then()
                .log().all()
                .statusCode(200);
    }

    @Test
    @DisplayName("PUT Activities")
    public void putActivitiesTest() {
        Response response = Activities.getPutResponse();

        response.then()
                .log().all()
                .statusCode(200);
    }

    @Test
    @DisplayName("DELETE Activities")
    public void deleteActivitiesTest() {
        Response response = Activities.doDeleteRequest();

        response.then()
                .log().all()
                .statusCode(200);
    }
}
