import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum VehicleType {
    SEDAN,
    SUV,
    TRUCK
}

public enum DriverStatus {
    FREE,
    ON_ORDER,
    OFFLINE
}

public class Driver {
    private String name;
    private String phone;
    private String LicenseNumber;
    private VehicleType vehicleType;
    private DriverStatus status;

    public Driver(String name, String phone, String LicenseNumber,
                  VehicleType vehicleType, DriverStatus status) {
        this.name = name;
        this.phone = phone;
        this.LicenseNumber = LicenseNumber;
        this.vehicleType = vehicleType;
        this.status = status;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLicenseNumber() { return LicenseNumber; }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.LicenseNumber = driverLicenseNumber;
    }

    public VehicleType getVehicleType() { return vehicleType; }
    public void setVehicleType(VehicleType vehicleType) { this.vehicleType = vehicleType; }

    public DriverStatus getStatus() { return status; }
    public void setStatus(DriverStatus status) { this.status = status; }
}
