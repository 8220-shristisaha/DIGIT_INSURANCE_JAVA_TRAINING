import java.util.Scanner;

class Rectangle{
    private int length;
    private int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void area(){
        System.out.println("The area is : "+ (length*breadth));
    }

    public void perimeter(){
        System.out.println("The rectangle is : "+ ( 2*(length+breadth)));
    }

}


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle : ");
        int length= scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int breadth= scanner.nextInt();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);

        rectangle.area();
        rectangle.perimeter();

    }
}