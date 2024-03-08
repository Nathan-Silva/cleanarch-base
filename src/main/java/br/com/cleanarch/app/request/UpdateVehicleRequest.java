package br.com.cleanarch.app.request;

public class UpdateVehicleRequest {


    public String nomeVeiculo;

    public String marcaVeiculo;

    public Integer anoVeiculo;

    public String descricaoVeiculo;

    public Boolean veiculoVendido;

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public Integer getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Integer anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    public void setDescricaoVeiculo(String descricaoVeiculo) {
        this.descricaoVeiculo = descricaoVeiculo;
    }

    public Boolean getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Boolean veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }
}
