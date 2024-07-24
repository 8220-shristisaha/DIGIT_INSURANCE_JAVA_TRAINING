import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year ");
        int year = scanner.nextInt();

        String duplicateDigit=Integer.toString(year);
        int length=duplicateDigit.length();

        if(length==4){
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("[" + year + "] is a leap year ");
            }
            else{
                System.out.println("[" + year + "] is not a leap year ");

            }
        }
    }
}