package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testContractCreation(){
        given().body("{\"name\":\"cars\"}")
          .when().post("/contracts")
          .then()
             .statusCode(201);
    }

   

}