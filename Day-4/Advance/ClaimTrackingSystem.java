import java.util.ArrayList;
import java.util.Scanner;

class claims{
    int claimNumber;
    int policyNumber;
    String status;

}

public class ClaimTrackingSystem {
    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);
        ArrayList<Policy> arrayList= new ArrayList<>();
        String choice= "y";
        do{
            System.out.println("1.add\n2.update\n3.update\n4.print");
            System.out.println("Enter you choice : ");
            String ch = scanner.next();
            switch(ch){
                case "1" ->add(scanner,arrayList);
                case "2" ->delete(scanner,arrayList);
                case "3" ->update(scanner,arrayList);
                case "4" ->print(arrayList);
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to continue ? ");
            choice= scanner.next();
            choice=choice.toLowerCase();

        }while(choice.equals("y"));


    }
    public static void add(ArrayList<claims>arrayList){

    }
}
