import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        scanner.close();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        area = Math.round(area * 100.0) / 100.0;

        System.out.println("The area of the hexagon is " + area);
    }
}