package nextstep.subway.utils;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import java.net.URI;

public class RestTestUtils {
    public static URI getLocationURI(ExtractableResponse<Response> response) {
        return URI.create(response.header("Location"));
    }

    public static Long 응답ID추출(ExtractableResponse<Response> response) {
        return response.jsonPath().getLong("id");
    }
}
