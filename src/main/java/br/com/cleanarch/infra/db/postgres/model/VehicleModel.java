package br.com.cleanarch.infra.db.postgres.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_VEICULO")
public class VehicleModel extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle_seq")
    @SequenceGenerator(name = "vehicle_seq", sequenceName = "vehicle_seq")
    private Integer vehicleId;

    @Column(name = "vehicle_name")
    public String vehicleName;

    @Column(name = "vehicle_brand")
    public String vehicleBrand;

    @Column(name = "vehicle_year")
    public Integer vehicleYear;

    @Column(name = "vehicle_description")
    public String vehicleDescription;

    @Column(name = "vehicle_saled")
    public Boolean vehicleSaled;

    @Column(name = "vehicle_created")
    public LocalDateTime vehicleCreated;

    @Column(name = "vehicle_updated")
    public LocalDateTime vehicleUpdated;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Integer getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(Integer vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public Boolean getVehicleSaled() {
        return vehicleSaled;
    }

    public void setVehicleSaled(Boolean vehicleSaled) {
        this.vehicleSaled = vehicleSaled;
    }

    public LocalDateTime getVehicleCreated() {
        return vehicleCreated;
    }

    public void setVehicleCreated(LocalDateTime vehicleCreated) {
        this.vehicleCreated = vehicleCreated;
    }

    public LocalDateTime getVehicleUpdated() {
        return vehicleUpdated;
    }

    public void setVehicleUpdated(LocalDateTime vehicleUpdated) {
        this.vehicleUpdated = vehicleUpdated;
    }
}
