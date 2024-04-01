package br.com.cleanarch.app.mapper;


import br.com.cleanarch.app.request.CreateVehicleRequest;
import br.com.cleanarch.app.request.UpdateVehicleRequest;
import br.com.cleanarch.domain.dto.VehicleDTO;

public class VehicleAppMapper {

    public static VehicleDTO toDto(CreateVehicleRequest createVehicleRequest) {
        var dto = new VehicleDTO();

        dto.setVehicleName(createVehicleRequest.getVehicleName());
        dto.setVehicleYear(createVehicleRequest.getVehicleYear());
        dto.setVehicleBrand(createVehicleRequest.getVehicleBrand());
        dto.setVehicleDescription(createVehicleRequest.getVehicleDescription());
        dto.setVehicleSaled(createVehicleRequest.getVehicleSaled());

        return dto;
    }

    public static VehicleDTO toDto(UpdateVehicleRequest updateVehicleRequest) {
        var dto = new VehicleDTO();

        dto.setVehicleName(updateVehicleRequest.getVehicleName());
        dto.setVehicleYear(updateVehicleRequest.getVehicleYear());
        dto.setVehicleBrand(updateVehicleRequest.getVehicleBrand());
        dto.setVehicleDescription(updateVehicleRequest.getVehicleDescription());
        dto.setVehicleSaled(updateVehicleRequest.getVehicleSaled());

        return dto;
    }
}
