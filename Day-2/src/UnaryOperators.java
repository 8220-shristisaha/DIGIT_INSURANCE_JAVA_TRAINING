import java.util.Scanner;

public class UnaryOperators {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= scanner.nextInt();

        System.out.println(num++);
        System.out.println(++num);

        num++;
        System.out.println(num);
        ++num;
        System.out.println(num);
    }
}