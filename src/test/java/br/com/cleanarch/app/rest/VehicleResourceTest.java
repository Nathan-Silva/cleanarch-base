package br.com.cleanarch.app.rest;

import groovy.json.JsonBuilder;
import io.quarkus.test.junit.QuarkusTest;
import io.vertx.core.json.JsonObject;
import jakarta.json.Json;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import kong.unirest.json.JSONObject;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
@Tag("integration")
@QuarkusTest
class VehicleResourceTest {

    @Test
    @Order(1)
    @DisplayName("Should get all vehicles registered in database")
    void shouldFindAllVehicles() {
        given()
                .when().get("/api/v1/veiculos")
                .then()
                .body("size()", is(2))
                .body("vehicleId", hasItems(1, 2))
                .body("vehicleName", hasItems("2008", "Cullinan"))
                .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    @Order(1)
    @DisplayName("Should get vehicles by id registered in database")
    void findVehicleById() {
        given()
                .when().get("/api/v1/veiculos/1")
                .then()
                .body("vehicleId", is(1))
                .body("vehicleName", is("2008"))
                .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    @Order(2)
    @DisplayName("Should create a new vehicle in database")
    void createVehicle() {
        JSONObject json = new JSONObject();
        json.put( "vehicleName", "Celta");
        json.put( "vehicleBrand", "Chevrolet");
        json.put( "vehicleYear", 2009);
        json.put( "vehicleDescription", "Vehicle description");
        json.put( "vehicleSaled", false);

        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body(json.toString())
                .when()
                .post("/api/v1/veiculos")
                .then()
                .body("vehicleId", is(3))
                .body("vehicleName", is("Celta"))
                .body("vehicleSaled", is(false))
                .statusCode(Response.Status.CREATED.getStatusCode());
    }

    @Test
    @Order(3)
    @DisplayName("Should update vehicle by id")
    void updateVehicle() {
        JSONObject json = new JSONObject();
        json.put( "vehicleName", "Celta");
        json.put( "vehicleBrand", "Chevrolet");
        json.put( "vehicleYear", 2009);
        json.put( "vehicleDescription", "Vehicle description");
        json.put( "vehicleSaled", true);

        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body(json.toString())
                .when()
                .put("/api/v1/veiculos/3")
                .then()
                .body("vehicleId", equalTo(3))
                .body("vehicleName", equalTo("Celta"))
                .body("vehicleBrand", equalTo("Chevrolet"))
                .body("vehicleYear", equalTo(2009))
                .body("vehicleDescription", equalTo("Vehicle description"))
                .body("vehicleSaled", equalTo(true))
                .body("vehicleUpdated", notNullValue())
                .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    @Order(4)
    @DisplayName("Should delete vehicle by id")
    void deleteById(){
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .when()
                .delete("/api/v1/veiculos/3")
                .then()
                .statusCode(Response.Status.OK.getStatusCode());
    }
}