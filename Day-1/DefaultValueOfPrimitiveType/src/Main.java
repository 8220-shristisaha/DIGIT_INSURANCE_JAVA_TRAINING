//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int intVariable;
    float floatVariable;
    double doubleVariable;
    boolean booleanVariable;
    char charVariable;
    long longVariable;
    byte byteVariable;
    short shortVariable;


    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("Default Value of int : "+main.intVariable);
        System.out.println("Default Value of float : "+main.floatVariable);
        System.out.println("Default Value of double : "+main.doubleVariable);
        System.out.println("Default Value of boolean  : "+main.booleanVariable);
        System.out.println("Default Value of char  : "+main.charVariable);
        System.out.println("Default Value of long  : "+main.longVariable);
        System.out.println("Default Value of byte   : "+main.byteVariable);
        System.out.println("Default Value of short   : "+main.shortVariable);

    }
}