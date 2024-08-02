import java.util.Scanner;

public class Seven {

    public static class InsufficientFundsException extends Exception{
        InsufficientFundsException(String e){
            super(e);
        }
    }
    public static void main(String[] args) throws InsufficientFundsException {
        try(Scanner scanner= new Scanner(System.in)){
            System.out.println("Enter the Balance : ");
            double balance = scanner.nextDouble();

            System.out.println("Enter the amount :");
            double amount = scanner.nextDouble();
            withdraw(amount, balance);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    private static void withdraw(double amount, double balance) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient Balance : ( ");
        }
    }

}
