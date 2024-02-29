package models;

import models.enums.ParkingLotStatus;
import models.enums.VehicleType;

public class ParkingSpot extends BaseModel {
    private int number;
    private VehicleType vehicleType;
    private ParkingLotStatus parkingLotStatus;
    private Vehicle vehicle;

    public ParkingSpot() {
    }

    public ParkingSpot(int number, VehicleType vehicleType, ParkingLotStatus parkingLotStatus, Vehicle vehicle) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
