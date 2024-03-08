package br.com.cleanarch.app.rest;

import br.com.cleanarch.app.request.CreateVehicleRequest;
import br.com.cleanarch.app.request.UpdateVehicleRequest;
import br.com.cleanarch.app.service.VehicleService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/api/v1/veiculos")
public class VehicleResource {

    @Inject
    VehicleService vehicleService;

    @GET
    public Response findAllVehicles() {
        var allVehicles = vehicleService.findAllVehicles();
        return Response.ok(allVehicles).build();
    }

    @GET
    @Path("/{id}")
    public Response findVehicleById(@PathParam("id") Integer id) {
        var vehicle = vehicleService.findVehicleById(id);
        return Response.ok(vehicle).build();
    }

    @GET
    @Path("/{marca}/{ano}/{vendido}")
    public Response findVehicleByParameters(@PathParam("marca") String marca, @PathParam("ano") String ano, @PathParam("vendido") Boolean vendido) {
//        var vehicle = vehicleService.findVehicleById(id);
        return Response.ok().build();
    }

    @POST
    public Response createVehicle(CreateVehicleRequest createVehicleRequest) {
        var createdVehicle = vehicleService.create(createVehicleRequest);
        return Response.ok(createdVehicle).build();
    }


    @PUT
    @Path("/{id}")
    public Response updateVehicle(@PathParam("id") Integer id, UpdateVehicleRequest updateVehicleRequest) {
        var updatedVehicle = vehicleService.update(id, updateVehicleRequest);
        return Response.ok(updatedVehicle).build();
    }
}
