package br.com.cleanarch.domain.usecase;

import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.entity.VehicleEntity;
import br.com.cleanarch.domain.exception.BusinessException;
import br.com.cleanarch.domain.mapper.VehicleMapper;
import br.com.cleanarch.domain.repositories.IVehicleRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

@QuarkusTest
@ExtendWith(MockitoExtension.class)
class QueriesVehicleUseCaseTest {

    @InjectMocks
    QueriesVehicleUseCase queriesVehicleUseCase;

    @Mock
    IVehicleRepository vehicleRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Should return a list of all vehicles registered in database")
    void listAllVehiclesWithSuccess() {
        List<VehicleEntity> vehicleEntityList = new ArrayList<>();
        var vehicleDto = new VehicleDTO();
        vehicleDto.setVehicleName("Santana");
        vehicleDto.setVehicleBrand("Volkswagen");
        vehicleDto.setVehicleYear(1992);
        vehicleDto.setVehicleDescription("Vehicle descriptions test");
        vehicleDto.setVehicleSaled(false);
        vehicleDto.setVehicleCreated(LocalDateTime.now());

        var vehicleDto2 = new VehicleDTO();
        vehicleDto2.setVehicleName("Gol");
        vehicleDto2.setVehicleBrand("Volkswagen");
        vehicleDto2.setVehicleYear(2003);
        vehicleDto2.setVehicleDescription("Vehicle descriptions test");
        vehicleDto2.setVehicleSaled(true);
        vehicleDto2.setVehicleCreated(LocalDateTime.now());

        vehicleEntityList.add(VehicleMapper.toEntity(vehicleDto));
        vehicleEntityList.add(VehicleMapper.toEntity(vehicleDto2));

        BDDMockito.given(vehicleRepository.findAllVehicle()).willReturn(vehicleEntityList);

        List<VehicleDTO> vehicleDTOList = queriesVehicleUseCase.listAllVehicles();

        assertNotNull(vehicleDTOList);
        assertEquals(vehicleDTOList.size(), 2);
    }

    @Test
    @DisplayName("Should get vehicle by id from database")
    void findVehicleByIdWithSuccess() {
        var vehicleDto2 = new VehicleDTO();
        vehicleDto2.setVehicleId(2);
        vehicleDto2.setVehicleName("Gol");
        vehicleDto2.setVehicleBrand("Volkswagen");
        vehicleDto2.setVehicleYear(2003);
        vehicleDto2.setVehicleDescription("Vehicle descriptions test");
        vehicleDto2.setVehicleSaled(true);
        vehicleDto2.setVehicleCreated(LocalDateTime.now());

        BDDMockito.given(vehicleRepository.findVehicleById(anyInt())).willReturn(VehicleMapper.toEntity(vehicleDto2));
        VehicleDTO vehicleDTO = queriesVehicleUseCase.findVehicleById(2);

        assertNotNull(vehicleDTO);
        assertEquals(vehicleDTO.getVehicleId(), 2);
    }

    @Test
    @DisplayName("Should return a empty list of vehicles registered in database")
    void listAllVehiclesWithFail() {
        List<VehicleEntity> vehicleEntityList = new ArrayList<>();

        BDDMockito.given(vehicleRepository.findAllVehicle()).willReturn(vehicleEntityList);

        assertThrows(BusinessException.class, () -> queriesVehicleUseCase.listAllVehicles());
    }
}