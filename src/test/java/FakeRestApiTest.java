import activities.Activities;
import activities.ActivityBody;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
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
        ActivityBody body = new ActivityBody(0,"java","2025-02-19T16:29:22.73Z",false);
        Response response = Activities.getPutResponse();

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(response.getStatusCode()).isEqualTo(200);
        softAssertions.assertThat(response.getBody().as(ActivityBody.class)).isEqualTo(body);
        softAssertions.assertAll();
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
