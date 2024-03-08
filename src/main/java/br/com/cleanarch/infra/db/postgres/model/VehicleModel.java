package br.com.cleanarch.infra.db.postgres.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_VEICULO")
public class VehicleModel extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME_VEICULO")
    public String nomeVeiculo;

    @Column(name = "MARCA_VEICULO")
    public String marcaVeiculo;

    @Column(name = "ANO_VEICULO")
    public Integer anoVeiculo;

    @Column(name = "DESCRICAO_VEICULO")
    public String descricaoVeiculo;

    @Column(name = "VEICULO_VENDIDO")
    public Boolean veiculoVendido;

    @Column(name = "created")
    public LocalDateTime created;

    @Column(name = "updated")
    public LocalDateTime updated;

    public Integer getIdVeiculo() {
        return id;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.id = idVeiculo;
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
