package br.com.cleanarch.app.rest;

import br.com.cleanarch.app.request.CreateVehicleRequest;
import br.com.cleanarch.app.request.UpdateVehicleRequest;
import br.com.cleanarch.app.service.VehicleService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/veiculos")
@ApplicationScoped
public class VehicleResource {

    @Inject
    VehicleService vehicleService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllVehicles() {
        var allVehicles = vehicleService.findAllVehicles();
        return Response.ok(allVehicles).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findVehicleById(@PathParam("id") Integer id) {
        var vehicle = vehicleService.findVehicleById(id);
        return Response.ok(vehicle).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createVehicle(CreateVehicleRequest createVehicleRequest) {
        var createdVehicle = vehicleService.create(createVehicleRequest);
        return Response.ok(createdVehicle).status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateVehicle(@PathParam("id") Integer id, UpdateVehicleRequest updateVehicleRequest) {
        var updatedVehicle = vehicleService.update(id, updateVehicleRequest);
        return Response.ok(updatedVehicle).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteVehicle(@PathParam("id") Integer id){
        vehicleService.delete(id);
        return Response.ok().build();
    }
}
