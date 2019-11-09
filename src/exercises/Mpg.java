package exercises;
import java.util.Scanner;

public class Mpg {

    public Mpg() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles driven");
        int miles = scanner.nextInt();

        System.out.println("Enter gallons used");
        int gallons = scanner.nextInt();

        int milesPerGallon = miles / gallons;

        System.out.println("MPG is:" +milesPerGallon);
    }


}
