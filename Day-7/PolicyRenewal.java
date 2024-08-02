class PolicyExpiredException extends Exception {
    PolicyExpiredException(String e) {
        super(e);
    }
}
class PaymentPendingException extends Exception {
    PaymentPendingException(String e) {
        super(e);
    }
}
class NonComplianceException extends Exception {
    NonComplianceException(String e) {
        super(e);
    }
}
public class PolicyRenewal {
    public static void main(String[] args) {
        try {
            renewPolicy("active", true, true); // Example policy details
            System.out.println("Policy renewed successfully.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void renewPolicy(String policyStatus, boolean paymentHistory, boolean compliance)
            throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (!"active".equals(policyStatus)) {
            throw new PolicyExpiredException("Policy has expired.");
        }

        if (!paymentHistory) {
            throw new PaymentPendingException("Payment is pending.");
        }

        if (!compliance) {
            throw new NonComplianceException("Policyholder is not in compliance with renewal terms.");
        }
    }
}