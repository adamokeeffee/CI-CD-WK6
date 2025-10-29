package ie.atu.week5lab.errorHandling;

public class PassengerNotFoundException extends RuntimeException {
    private String message;

    public PassengerNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public PassengerNotFoundException() {
        super("Passenger not found");
    }

    public String getMessage() {
        return message;
    }
}

