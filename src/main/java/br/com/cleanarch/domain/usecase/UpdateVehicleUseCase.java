package br.com.cleanarch.domain.usecase;


import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.mapper.VehicleMapper;
import br.com.cleanarch.domain.repositories.IVehicleRepository;

public class UpdateVehicleUseCase {

    private IVehicleRepository vehicleRepository;


    public UpdateVehicleUseCase(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    public VehicleDTO update(Integer id, VehicleDTO vehicleDTO) {

        vehicleDTO.setId(id);

        var vehicleEntity = VehicleMapper.toEntity(vehicleDTO);
        vehicleEntity = vehicleRepository.updatePut(vehicleEntity);

        return VehicleMapper.toDto(vehicleEntity);

    }

}
