import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FlipCoin {
    public static boolean check(int numberOfFlip){
        if(numberOfFlip>=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of flip : ");
        int numberOfFlip = scanner.nextInt();

        int heads=0;
        int tails=0;

        if(check(numberOfFlip)){
            Random randomNumber = new Random();
            for(int i=0;i<numberOfFlip;++i){
                if(randomNumber.nextInt()<0.5){
                    tails++;
                }
                else{
                    heads++;
                }
            }


            double headPercentage= ((double) heads /(heads+tails))*100;
            double tailPercentage= ((double) tails/(heads+tails))*100;

            System.out.println("Total Head Count : "+heads);
            System.out.println("Total Tail Count : "+tails);

            System.out.println("Head percentage : " + headPercentage);
            System.out.println("Tail percentage : " + tailPercentage);


        }
        else{
            System.out.println("Enter a positive Integer  :>");
        }
    }
}