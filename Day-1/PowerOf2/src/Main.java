import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("N should be 0<=N<31 \n Enter N : ");
        int N=scanner.nextInt();

        if(N>=0 && N<31){
            for(int i=0;i<N;++i) {
                System.out.println((int)Math.pow(2, i));
            }
        }
        else{
            System.out.println("N should be 0<=N<31 ");
        }

    }
}