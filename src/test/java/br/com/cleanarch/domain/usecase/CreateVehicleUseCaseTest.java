package br.com.cleanarch.domain.usecase;

import br.com.cleanarch.domain.dto.VehicleDTO;
import br.com.cleanarch.domain.entity.VehicleEntity;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@QuarkusTest
@ExtendWith(MockitoExtension.class)
class CreateVehicleUseCaseTest {

    @InjectMocks
    CreateVehicleUseCase createVehicleUseCase;

    @Mock
    IVehicleRepository vehicleRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Should create a new vehicle in database")
    void create() {
        //ARRANGE
        var vehicleDto = new VehicleDTO();
        vehicleDto.setVehicleName("Santana");
        vehicleDto.setVehicleBrand("Volkswagen");
        vehicleDto.setVehicleYear(1992);
        vehicleDto.setVehicleDescription("Vehicle descriptions test");
        vehicleDto.setVehicleSaled(false);
        vehicleDto.setVehicleCreated(LocalDateTime.now());

        //ACT
        BDDMockito.given(vehicleRepository.create(any(VehicleEntity.class))).willReturn(VehicleMapper.toEntity(vehicleDto));

        var vehicleRespose = createVehicleUseCase.create(vehicleDto);

        //ASSERT
        assertEquals(vehicleDto.getVehicleName(), vehicleRespose.getVehicleName());
        assertEquals(vehicleDto.getVehicleBrand(), vehicleRespose.getVehicleBrand());
        assertEquals(vehicleDto.getVehicleSaled(), vehicleRespose.getVehicleSaled());
        assertEquals(vehicleDto.getVehicleDescription(), vehicleRespose.getVehicleDescription());
        assertEquals(vehicleDto.getVehicleBrand(), vehicleRespose.getVehicleBrand());
        assertNotNull(vehicleRespose.getVehicleCreated());
    }
}