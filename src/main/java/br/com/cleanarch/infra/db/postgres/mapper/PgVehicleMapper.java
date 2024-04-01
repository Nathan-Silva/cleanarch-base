package br.com.cleanarch.infra.db.postgres.mapper;


import br.com.cleanarch.domain.entity.VehicleEntity;
import br.com.cleanarch.infra.db.postgres.model.VehicleModel;

public class PgVehicleMapper {

    public static VehicleEntity toEntity(VehicleModel vehicleModel) {
        var entity = new VehicleEntity(
                vehicleModel.getVehicleId(),
                vehicleModel.getVehicleName(),
                vehicleModel.getVehicleBrand(),
                vehicleModel.getVehicleYear(),
                vehicleModel.getVehicleDescription(),
                vehicleModel.getVehicleSaled(),
                vehicleModel.getVehicleCreated(),
                vehicleModel.getVehicleUpdated()
        );

        return entity;
    }

    public static VehicleModel toModel(VehicleEntity vehicleEntity) {
        var vehicleModel = new VehicleModel();

        vehicleModel.setVehicleId(vehicleEntity.getVehicleId());
        vehicleModel.setVehicleName(vehicleEntity.getVehicleName());
        vehicleModel.setVehicleBrand(vehicleEntity.getVehicleBrand());
        vehicleModel.setVehicleYear(vehicleEntity.getVehicleYear());
        vehicleModel.setVehicleDescription(vehicleEntity.getVehicleDescription());
        vehicleModel.setVehicleSaled(vehicleEntity.getVehicleSaled());
        vehicleModel.setVehicleCreated(vehicleEntity.getVehicleCreated());
        vehicleModel.setVehicleUpdated(vehicleEntity.getVehicleUpdated());

        return vehicleModel;
    }
}
