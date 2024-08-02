class FraudulentClaimException extends RuntimeException {
    FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    InvalidClaimAmountException(String message) {
        super(message);
    }
}
public class ClaimProcessingSystem {
    public static void main(String[] args) {
        try {
            processClaim(5000, "2023-10-01");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void processClaim(double claimAmount, String claimDate) {

        double policyCoverageAmount = 10000;
        String policyStartDate = "2023-01-01";
        String policyEndDate = "2023-12-31";

        if (claimAmount <= 0 || claimAmount > policyCoverageAmount) {
            throw new InvalidClaimAmountException("Claim amount is invalid.");
        }

        if (claimDate.compareTo(policyStartDate) < 0 || claimDate.compareTo(policyEndDate) > 0) {
            throw new FraudulentClaimException("Claim date is outside policy coverage period.");
        }

        System.out.println("Claim processed successfully.");
    }
}