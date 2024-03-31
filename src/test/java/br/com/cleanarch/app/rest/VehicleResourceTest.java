package br.com.cleanarch.app.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.not;

@QuarkusTest
class VehicleResourceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Should get all vehicles registered in database")
    void shouldFindAllVehicles() {
        given()
                .when().get("/api/v1/veiculos")
                .then()
                .statusCode(200)
                .body("size()", not(0));
    }

    @Test
    void findVehicleById() {
    }

    @Test
    void findVehicleByParameters() {
    }

    @Test
    void createVehicle() {
    }

    @Test
    void updateVehicle() {
    }
}