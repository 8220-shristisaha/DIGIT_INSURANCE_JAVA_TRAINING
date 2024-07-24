import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value1;
        String value2;

        System.out.println("Enter value1 : ");
        value1= scanner.next();

        System.out.println("Enter value1 : ");
        value2= scanner.next();


        if(value1.equals(value2)){
            System.out.println("String value1 & value2 are equals");
        }
        else{
            System.out.println("String value1 & value2 are not equals");

        }
    }
}