import java.util.ArrayList;
import java.util.Scanner;

class Policy{
    String policyNumber;
    String policyName;
    String TypeOfInsurance;
    String coverageAmount;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getTypeOfInsurance() {
        return TypeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        TypeOfInsurance = typeOfInsurance;
    }

    public String getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(String coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyName='" + policyName + '\'' +
                ", TypeOfInsurance='" + TypeOfInsurance + '\'' +
                ", coverageAmount='" + coverageAmount + '\'' +
                '}';
    }
}

public class PolicyManagement {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Policy> arrayList= new ArrayList<>();
        String choice= "y";
        do{
            System.out.println("1.add\n2.delete\n3.update\n4.print");
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

    private static void print(ArrayList<Policy> arrayList) {
        for(Policy a:arrayList){
            System.out.println(a.toString());
        }
    }

    private static void update(Scanner scanner, ArrayList<Policy> arrayList) {

        System.out.println("Enter you choice \n1.Update Name\n2.Update Type Of Insurance ");
        String ch=scanner.next();
        System.out.println("Enter your policy number :");
        String policynum=scanner.next();
        switch(ch){
            case "1" :{
                for(Policy a:arrayList){
                    if(a.getPolicyNumber()==policynum){
                        System.out.println("Enter your name : ");
                        String name=scanner.next();
                        a.setPolicyName(name);
                    }
                }
                break;
            }
            case "2" :{
                for(Policy a:arrayList){
                    if(a.getPolicyNumber()==policynum){
                        System.out.println("Enter your Insurance : ");
                        String name=scanner.next();
                        a.setTypeOfInsurance(name);
                    }
                }
                break;
            }
            default:{
                System.out.println("Invalid choice ");
            }
        }
    }

    private static void delete(Scanner scanner, ArrayList<Policy> arrayList) {
        System.out.println("Enter your policy number :");
        String policynum=scanner.next();
        for(Policy a:arrayList){
            if(a.getPolicyNumber().equals(policynum)){
                arrayList.remove(a);
                break;
            }
        }

    }


    private static void add(Scanner scanner,ArrayList<Policy> arrayList){
        Policy policy = new Policy();
        System.out.println("Enter the Policy Name : ");
        String policyName=scanner.next();
        policy.setPolicyName(policyName);

        System.out.println("Enter the Policy Number : ");
        String number=scanner.next();
        policy.setPolicyNumber(number);

        System.out.println("Enter the type of insurance : ");
        String type =scanner.next();
        policy.setTypeOfInsurance(type);

        System.out.println("Enter the Coverage Amount : ");
        String amount =scanner.next();
        policy.setCoverageAmount(amount);

        arrayList.add(policy);

    }
}
