package br.com.cleanarch.domain.mapper;


import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.entity.VehicleEntity;

public class VehicleMapper {


    public static VehicleDTO toDto(VehicleEntity vehicleEntity) {
        var dto = new VehicleDTO();

        dto.setId(vehicleEntity.getId());
        dto.setNomeVeiculo(vehicleEntity.getNomeVeiculo());
        dto.setAnoVeiculo(vehicleEntity.getAnoVeiculo());
        dto.setMarcaVeiculo(vehicleEntity.getMarcaVeiculo());
        dto.setDescricaoVeiculo(vehicleEntity.getDescricaoVeiculo());
        dto.setVeiculoVendido(vehicleEntity.getVeiculoVendido());
        dto.setCreated(vehicleEntity.getCreated());
        dto.setUpdated(vehicleEntity.getUpdated());

        return dto;
    }

    public static VehicleEntity toEntity(VehicleDTO vehicleModel) {
        return new VehicleEntity(

                vehicleModel.getId(),
                vehicleModel.getNomeVeiculo(),
                vehicleModel.getMarcaVeiculo(),
                vehicleModel.getAnoVeiculo(),
                vehicleModel.getDescricaoVeiculo(),
                vehicleModel.getVeiculoVendido(),
                vehicleModel.getCreated(),
                vehicleModel.getUpdated()
        );
    }
}
