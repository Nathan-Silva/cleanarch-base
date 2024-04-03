package br.com.cleanarch.app.service;


import br.com.cleanarch.app.mapper.VehicleAppMapper;
import br.com.cleanarch.app.request.CreateVehicleRequest;
import br.com.cleanarch.app.request.UpdateVehicleRequest;
import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.repositories.IVehicleRepository;
import br.com.cleanarch.domain.usecase.CreateVehicleUseCase;
import br.com.cleanarch.domain.usecase.DeleteVehicleUseCase;
import br.com.cleanarch.domain.usecase.QueriesVehicleUseCase;
import br.com.cleanarch.domain.usecase.UpdateVehicleUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

import java.util.List;

@ApplicationScoped
public class VehicleService extends AbstractService {

    @Default
    IVehicleRepository vehicleRepository;

    public List<VehicleDTO> findAllVehicles() {
        var queryUseCase = new QueriesVehicleUseCase(vehicleRepository);
        return queryUseCase.listAllVehicles();
    }

    public VehicleDTO findVehicleById(Integer id) {
        var queryUseCase = new QueriesVehicleUseCase(vehicleRepository);
        return queryUseCase.findVehicleById(id);
    }

    public VehicleDTO create(CreateVehicleRequest createVehicleRequest) {
        var createdVehicle = new CreateVehicleUseCase(vehicleRepository);

        return createdVehicle.create(VehicleAppMapper.toDto(createVehicleRequest));
    }

    public VehicleDTO update(Integer id, UpdateVehicleRequest updateVehicleRequest) {
        var updatedVehicle = new UpdateVehicleUseCase(vehicleRepository);
        return updatedVehicle.update(id, VehicleAppMapper.toDto(updateVehicleRequest));
    }

    public void delete(Integer id){
        var deleteVehicle = new DeleteVehicleUseCase(vehicleRepository);
        deleteVehicle.deleteById(id);
    }

}
