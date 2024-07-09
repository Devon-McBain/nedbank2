import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.restassured.RestAssured.given;

public class ScratchPadBasicTests {

    @Test
    public void basicTest(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/firefox.geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.manage().window().maximize();

    }

    @Test
    public void Basic(){
        String jsonbody = "{\n" +
                "        \"alpha_two_code\": \"ZA\",\n" +
                "        \"name\": \"University of Witwatersrand\",\n" +
                "        \"domains\": [\n" +
                "            \"wits.ac.za\"\n" +
                "        ],\n" +
                "        \"web_pages\": [\n" +
                "            \"http://www.wits.ac.za/\"\n" +
                "        ],\n" +
                "        \"country\": \"South Africa\",\n" +
                "        \"state-province\": \"Gauteng Province\"\n" +
                "    }";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://universities.hipolabs.com/")
                //.addQueryParam("country","South Africa")
                //.addQueryParam("name","University of Witwatersrand")
                //.setBasePath("")
                .build();

        given()

                .log().all()
       .when()
                //.get("http://universities.hipolabs.com/search?name=middle&country=Turkey")
                .get("search?country=South Africa")//&name=University of Witwatersrand")
       .then()
               // .statusCode(200)
               // .body("country", equalTo("South Africa"))
               // .body("name", equalTo("University of Witwatersrand"))
                .log().all();
    }
}

//search?country=South Africa
//.get("http://universities.hipolabs.com/search?country=South Africa&name=University of Witwatersrand")

