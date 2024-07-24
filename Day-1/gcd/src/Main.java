//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("GCD of 18 and 24 is " +
                gcd(24, 18)
        );
    }

    private static int gcd(int a, int b) {

        if (b == 0) return a;

        return gcd(b, a % b);
    }
}