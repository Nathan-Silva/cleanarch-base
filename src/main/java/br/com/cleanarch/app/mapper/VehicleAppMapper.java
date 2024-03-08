package br.com.cleanarch.app.mapper;


import br.com.cleanarch.app.request.CreateVehicleRequest;
import br.com.cleanarch.app.request.UpdateVehicleRequest;
import br.com.cleanarch.domain.dto.VehicleDTO;

public class VehicleAppMapper {

    public static VehicleDTO toDto(CreateVehicleRequest createVehicleRequest) {
        var dto = new VehicleDTO();

        dto.setNomeVeiculo(createVehicleRequest.getNomeVeiculo());
        dto.setAnoVeiculo(createVehicleRequest.getAnoVeiculo());
        dto.setMarcaVeiculo(createVehicleRequest.getMarcaVeiculo());
        dto.setDescricaoVeiculo(createVehicleRequest.getDescricaoVeiculo());
        dto.setVeiculoVendido(createVehicleRequest.getVeiculoVendido());

        return dto;
    }

    public static VehicleDTO toDto(UpdateVehicleRequest updateVehicleRequest) {
        var dto = new VehicleDTO();

        dto.setNomeVeiculo(updateVehicleRequest.getNomeVeiculo());
        dto.setAnoVeiculo(updateVehicleRequest.getAnoVeiculo());
        dto.setMarcaVeiculo(updateVehicleRequest.getMarcaVeiculo());
        dto.setDescricaoVeiculo(updateVehicleRequest.getDescricaoVeiculo());
        dto.setVeiculoVendido(updateVehicleRequest.getVeiculoVendido());

        return dto;
    }
}
