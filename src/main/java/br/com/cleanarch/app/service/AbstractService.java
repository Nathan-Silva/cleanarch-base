package br.com.cleanarch.app.service;

import br.com.cleanarch.infra.db.postgres.repository.VehicleRepository;
import jakarta.inject.Inject;

public abstract class AbstractService {


    @Inject
    VehicleRepository vehicleRepository;
}
