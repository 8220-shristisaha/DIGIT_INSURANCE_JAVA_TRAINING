import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter two number : ");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int result = a/b;

        }
        catch(InputMismatchException | ArithmeticException e){
            System.out.println("Execption : " + e.getMessage());
        }
    }
}