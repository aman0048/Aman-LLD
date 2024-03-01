package exception;

public class ParkingSpotNotFoundForVehicleException extends RuntimeException{
    public ParkingSpotNotFoundForVehicleException() {
        super();
    }

    public ParkingSpotNotFoundForVehicleException(String message) {
        super(message);
    }

    public ParkingSpotNotFoundForVehicleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotFoundForVehicleException(Throwable cause) {
        super(cause);
    }

    protected ParkingSpotNotFoundForVehicleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
