package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main (String [] args)
    {
        new Mpg();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the Rectangle");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.println("Area of Rectangle is:"+area);

    }
}
