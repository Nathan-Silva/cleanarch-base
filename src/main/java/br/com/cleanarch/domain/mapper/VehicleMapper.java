package br.com.cleanarch.domain.mapper;


import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.entity.VehicleEntity;

public class VehicleMapper {


    public static VehicleDTO toDto(VehicleEntity vehicleEntity) {
        var dto = new VehicleDTO();

        dto.setVehicleId(vehicleEntity.getVehicleId());
        dto.setVehicleName(vehicleEntity.getVehicleName());
        dto.setVehicleYear(vehicleEntity.getVehicleYear());
        dto.setVehicleBrand(vehicleEntity.getVehicleBrand());
        dto.setVehicleDescription(vehicleEntity.getVehicleDescription());
        dto.setVehicleSaled(vehicleEntity.getVehicleSaled());
        dto.setVehicleCreated(vehicleEntity.getVehicleCreated());
        dto.setVehicleUpdated(vehicleEntity.getVehicleUpdated());

        return dto;
    }

    public static VehicleEntity toEntity(VehicleDTO vehicleModel) {
        return new VehicleEntity(

                vehicleModel.getVehicleId(),
                vehicleModel.getVehicleName(),
                vehicleModel.getVehicleBrand(),
                vehicleModel.getVehicleYear(),
                vehicleModel.getVehicleDescription(),
                vehicleModel.getVehicleSaled(),
                vehicleModel.getVehicleCreated(),
                vehicleModel.getVehicleUpdated()
        );
    }
}
