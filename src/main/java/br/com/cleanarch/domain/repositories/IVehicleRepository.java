package br.com.cleanarch.domain.repositories;


import br.com.cleanarch.domain.entity.VehicleEntity;

import java.util.List;

public interface IVehicleRepository {


    VehicleEntity create(VehicleEntity vehicleEntity);

    List<VehicleEntity> findAllVehicle();

    VehicleEntity findVehicleById(Integer id);

    VehicleEntity updatePut(VehicleEntity vehicleEntity);

    VehicleEntity updatePatch(VehicleEntity vehicleEntity);

    void delete(Integer id);
}
