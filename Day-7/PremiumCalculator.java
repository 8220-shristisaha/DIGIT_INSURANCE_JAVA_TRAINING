import java.util.Scanner;

class DataNotFoundException extends Exception {
    DataNotFoundException(String message) {
        super(message);
    }
}
class CalculationException extends RuntimeException {
    CalculationException(String message) {
        super(message);
    }
}

public class PremiumCalculator {

    public static void main(String[] args) {
        try {
            int age = fetchAge();
            String healthConditions = fetchHealthConditions();
            String vehicleType = fetchVehicleType();

            double lifePremium = calculateLifePremium(age);
            double healthPremium = calculateHealthPremium(healthConditions);
            double vehiclePremium = calculateVehiclePremium(vehicleType);

            System.out.println("Life Insurance Premium: " + lifePremium);
            System.out.println("Health Insurance Premium: " + healthPremium);
            System.out.println("Vehicle Insurance Premium: " + vehiclePremium);
        } catch (DataNotFoundException e) {
            System.err.println("Data error: " + e.getMessage());
        } catch (CalculationException e) {
            System.err.println("Calculation error: " + e.getMessage());

        }
    }

    public static int fetchAge() throws DataNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter age: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                throw new DataNotFoundException("Age data not found.");
            }
        }
    }

    public static String fetchHealthConditions() throws DataNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter health conditions: ");
            if (scanner.hasNext()) {
                return scanner.next();
            } else {
                throw new DataNotFoundException("Health conditions data not found.");
            }
        }
    }

    public static String fetchVehicleType() throws DataNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter vehicle type: ");
            if (scanner.hasNext()) {
                return scanner.next();
            } else {
                throw new DataNotFoundException("Vehicle type data not found.");
            }
        }
    }

    public static double calculateLifePremium(int age) {
        if (age <= 0) {
            throw new CalculationException("Invalid age for premium calculation.");
        }
        return age * 10;
    }

    public static double calculateHealthPremium(String healthConditions) {
        if (healthConditions == null || healthConditions.isEmpty()) {
            throw new CalculationException("Invalid health conditions for premium calculation.");
        }
        return healthConditions.length() * 20;
    }

    public static double calculateVehiclePremium(String vehicleType) {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new CalculationException("Invalid vehicle type for premium calculation.");
        }
        return vehicleType.length() * 30;
    }
}