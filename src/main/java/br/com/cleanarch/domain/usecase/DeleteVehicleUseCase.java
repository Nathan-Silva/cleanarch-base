package br.com.cleanarch.domain.usecase;

import br.com.cleanarch.domain.mapper.VehicleMapper;
import br.com.cleanarch.domain.repositories.IVehicleRepository;

public class DeleteVehicleUseCase {

    private IVehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void deleteById(Integer id){
        vehicleRepository.delete(id);
    }
}
