class InvalidAgeException extends Exception{
    InvalidAgeException(String e){
        super(e);
    }
}
class PoorDrivingRecordException extends Exception{
    PoorDrivingRecordException(String e){
        super(e);
    }
}
class HealthIssueException extends Exception{
    HealthIssueException(String e){
        super(e);
    }
}

public class PolicyApplication {
    public static void main(String[] args) {
        try{
            validateAge(12);
            validateDrivingRecord(false);
            validateHealthRecord(true);
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    private static void validateHealthRecord(boolean b) throws HealthIssueException{
        if (b) {
            throw new HealthIssueException("Applicant has health issues.");
        }
    }

    private static void validateDrivingRecord(boolean b) throws PoorDrivingRecordException {
        if (b) {
            throw new PoorDrivingRecordException("Applicant has a poor driving record.");
        }

    }

    private static void validateAge(int i) throws InvalidAgeException{
        if(i<18){
            throw new InvalidAgeException("Access Denied : UnderAge ");
        }
    }
}
