package br.com.cleanarch.app.request;

public class UpdateVehicleRequest {


    public String vehicleName;

    public String vehicleBrand;

    public Integer vehicleYear;

    public String vehicleDescription;

    public Boolean vehicleSaled;

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
}
