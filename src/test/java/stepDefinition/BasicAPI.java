package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class BasicAPI {


    public Response response;
    public int responseCode;

    @Given("A header")
    public void a_header() {
        RestAssured.baseURI = ("http://universities.hipolabs.com");
    }

    @When("Endpoint")
    public void endpoint() {

        response = given()
                .get("search?country=South Africa&name=University of Witwatersrand")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    @Then("Return the value of “state province” where name is the University of Witwatersrand")
    public void return_the_value_of_state_province_where_name_is_the_university_of_witwatersrand() {

        List<String> names = response.jsonPath().getList("name");
        String uniName = names.get(0);
        assertEquals("University of Witwatersrand", uniName);

        List<String> region = response.jsonPath().getList("country");
        String country = region.get(0);
        assertEquals("South Africa", country);

        responseCode = response.statusCode();
        assertEquals(responseCode, 200);

        //String province = response.jsonPath().getString("state-province");
        List<String> stateprovince = response.jsonPath().getList("state-province");
        String province = stateprovince.get(0);
        System.out.println(province);

    }
}


