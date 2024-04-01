package br.com.cleanarch.domain.usecase;


import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.exception.BusinessException;
import br.com.cleanarch.domain.mapper.VehicleMapper;
import br.com.cleanarch.domain.repositories.IVehicleRepository;

import java.util.List;
import java.util.stream.Collectors;

public class QueriesVehicleUseCase {

    private IVehicleRepository vehicleRepository;

    public QueriesVehicleUseCase(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<VehicleDTO> listAllVehicles(){
        var vehicleList = vehicleRepository.findAllVehicle();

        if(vehicleList.isEmpty())
            throw new BusinessException("01", "Database is empty");

        return vehicleList.stream()
                .map(VehicleMapper:: toDto)
                .collect(Collectors.toList());
    }

    public VehicleDTO findVehicleById(Integer id){
        var vehicle = vehicleRepository.findVehicleById(id);

        if(vehicle.getVehicleName().isEmpty())
            throw new BusinessException("01", "Database is empty");

        return VehicleMapper.toDto(vehicle);
    }
}
