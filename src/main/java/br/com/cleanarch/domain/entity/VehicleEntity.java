package br.com.cleanarch.domain.entity;

import java.time.LocalDateTime;

public class VehicleEntity {

    private Integer vehicleId;

    private String vehicleName;

    private String vehicleBrand;

    private Integer vehicleYear;

    private String vehicleDescription;

    private Boolean vehicleSaled;

    private LocalDateTime vehicleCreated;

    private LocalDateTime vehicleUpdated;

    public VehicleEntity(Integer vehicleId, String vehicleName, String vehicleBrand, Integer vehicleYear, String vehicleDescription, Boolean vehicleSaled, LocalDateTime vehicleCreated, LocalDateTime vehicleUpdated) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleBrand = vehicleBrand;
        this.vehicleYear = vehicleYear;
        this.vehicleDescription = vehicleDescription;
        this.vehicleSaled = vehicleSaled;
        this.vehicleCreated = vehicleCreated;
        this.vehicleUpdated = vehicleUpdated;
    }

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
