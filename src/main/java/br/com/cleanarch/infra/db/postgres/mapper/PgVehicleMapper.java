package br.com.cleanarch.infra.db.postgres.mapper;


import br.com.cleanarch.domain.entity.VehicleEntity;
import br.com.cleanarch.infra.db.postgres.model.VehicleModel;

public class PgVehicleMapper {

    public static VehicleEntity toEntity(VehicleModel vehicleModel) {
        var entity = new VehicleEntity(
                vehicleModel.getIdVeiculo(),
                vehicleModel.getNomeVeiculo(),
                vehicleModel.getMarcaVeiculo(),
                vehicleModel.getAnoVeiculo(),
                vehicleModel.getDescricaoVeiculo(),
                vehicleModel.getVeiculoVendido(),
                vehicleModel.getCreated(),
                vehicleModel.getUpdated()
        );

        return entity;
    }

    public static VehicleModel toModel(VehicleEntity vehicleEntity) {
        var vehicleModel = new VehicleModel();

        vehicleModel.setIdVeiculo(vehicleEntity.getId());
        vehicleModel.setNomeVeiculo(vehicleEntity.getNomeVeiculo());
        vehicleModel.setMarcaVeiculo(vehicleEntity.getMarcaVeiculo());
        vehicleModel.setAnoVeiculo(vehicleEntity.getAnoVeiculo());
        vehicleModel.setDescricaoVeiculo(vehicleEntity.getDescricaoVeiculo());
        vehicleModel.setVeiculoVendido(vehicleEntity.getVeiculoVendido());
        vehicleModel.setCreated(vehicleEntity.getCreated());
        vehicleModel.setUpdated(vehicleEntity.getUpdated());

        return vehicleModel;
    }
}
