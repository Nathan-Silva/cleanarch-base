package br.com.cleanarch.domain.entity;

import java.time.LocalDateTime;

public class VehicleEntity {

    private Integer id;

    private String nomeVeiculo;

    private String marcaVeiculo;

    private Integer anoVeiculo;

    private String descricaoVeiculo;

    private Boolean veiculoVendido;

    private LocalDateTime created;

    private LocalDateTime updated;

    public VehicleEntity(Integer id, String nomeVeiculo, String marcaVeiculo, Integer anoVeiculo, String descricaoVeiculo, Boolean veiculoVendido, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.nomeVeiculo = nomeVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.descricaoVeiculo = descricaoVeiculo;
        this.veiculoVendido = veiculoVendido;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
