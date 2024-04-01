package br.com.cleanarch.infra.db.postgres.repository;

import br.com.cleanarch.domain.entity.VehicleEntity;
import br.com.cleanarch.domain.repositories.IVehicleRepository;
import br.com.cleanarch.infra.db.postgres.mapper.PgVehicleMapper;
import br.com.cleanarch.infra.db.postgres.model.VehicleModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class VehicleRepository implements IVehicleRepository {

    @Override
    @Transactional
    public VehicleEntity create(VehicleEntity vehicleEntity) {
        var vehicleModel = PgVehicleMapper.toModel(vehicleEntity);
        vehicleModel.persistAndFlush();

        return PgVehicleMapper.toEntity(vehicleModel);
    }

    @Override
    public List<VehicleEntity> findAllVehicle() {
        return VehicleModel.findAll().stream()
                .map(value -> PgVehicleMapper.toEntity((VehicleModel) value))
                .collect(Collectors.toList());
    }

    @Override
    public VehicleEntity findVehicleById(Integer id) {
        return PgVehicleMapper.toEntity(VehicleModel.findById(id));
    }

    @Override
    @Transactional
    public VehicleEntity updatePut(VehicleEntity vehicleEntity) {
        var vehicleModel = PgVehicleMapper.toModel(vehicleEntity);
        VehicleModel.getEntityManager().merge(vehicleModel);

        return PgVehicleMapper.toEntity(vehicleModel);
    }

    @Override
    @Transactional
    public VehicleEntity updatePatch(VehicleEntity vehicleEntity) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        VehicleModel.deleteById(id);
    }
}
