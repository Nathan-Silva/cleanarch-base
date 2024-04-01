package br.com.cleanarch.domain.usecase;


import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.mapper.VehicleMapper;
import br.com.cleanarch.domain.repositories.IVehicleRepository;

import java.time.LocalDateTime;

public class CreateVehicleUseCase {

    private IVehicleRepository vehicleRepository;

    public CreateVehicleUseCase(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public VehicleDTO create(VehicleDTO vehicleDTO){

        vehicleDTO.setVehicleCreated(LocalDateTime.now());

        var vehicleEntity = VehicleMapper.toEntity(vehicleDTO);
        vehicleEntity = vehicleRepository.create(vehicleEntity);

        return VehicleMapper.toDto(vehicleEntity);
    }
}
