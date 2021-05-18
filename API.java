package api;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class API {

    @Test
    public void tpost1() {
        JSONObject x = new JSONObject();

        x.put("Name", "Connor");
        x.put("Job", "Fighter");

        System.out.println(x.toJSONString());

        given().
                body(x.toJSONString()).
        when().
                post ("https://reqres.in/api/users").
        then().
            statusCode(201);
    }

    @Test
    public void tpatch2() {
        JSONObject x = new JSONObject();

        x.put("Name", "Ortiz");
        x.put("Job", "Fighter");

        System.out.println(x.toJSONString());

        given().
                body(x.toJSONString()).
        when().
                patch ("https://reqres.in/api/users/2").
        then().
            statusCode(200);
    }

    @Test
    public void tget3() {

        when().
                get ("https://reqres.in/api/users/2").
        then().
            statusCode(200).log().all();
    }

    @Test
    public void tdel4() {

        when().
                delete ("https://reqres.in/api/users/2").
        then().
            statusCode(204).log().all();
    }

}