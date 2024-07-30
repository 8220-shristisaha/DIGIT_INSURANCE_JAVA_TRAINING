import java.util.ArrayList;
import java.util.Scanner;

class Claims{
    String claimNumber;
    String claimName;
    String claimAmount;
    String status;

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    public String getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claims{" +
                "claimNumber=" + claimNumber +
                ", claimName='" + claimName + '\'' +
                ", claimAmount='" + claimAmount + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

public class ClaimTrackingSystem {
    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);
        ArrayList<Claims> arrayList= new ArrayList<>();
        String choice= "y";
        do{
            System.out.println("1.add\n2.update\n3.print");
            System.out.println("Enter you choice : ");
            String ch = scanner.next();
            switch(ch){
                case "1" -> add(scanner,arrayList);
                case "2" -> update(scanner,arrayList);
                case "3" -> print(arrayList);
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to continue ? ");
            choice= scanner.next();
            choice=choice.toLowerCase();

        }while(choice.equals("y"));


    }
    private static void print(ArrayList<Claims> arrayList) {
        for(Claims a:arrayList){
            System.out.println(a.toString());
        }
    }

    private static void update(Scanner scanner, ArrayList<Claims> arrayList) {

        System.out.println(" Update Status ");
        System.out.println("Enter your claim number :");
        String claimnum=scanner.next();

        for (Claims a : arrayList) {
            if (a.getClaimNumber().equals(claimnum)) {
                System.out.println("Enter your Status : ");
                String name = scanner.next();
                a.setStatus(name);
            }
        }


    }


    private static void add(Scanner scanner, ArrayList<Claims> arrayList){
        Claims claims=new Claims();
        System.out.println("Enter the claim Name : ");
        String policyName=scanner.next();
        claims.setClaimName(policyName);

        System.out.println("Enter the claim Number : ");
        String number=scanner.next();
        claims.setClaimNumber(number);

        System.out.println("Enter the Status : ");
        String type =scanner.next();
        claims.setStatus(type);

        System.out.println("Enter the claim Amount : ");
        String amount =scanner.next();
        claims.setClaimAmount(amount);

        arrayList.add(claims);

    }
}
