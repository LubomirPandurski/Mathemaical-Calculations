package Circle;

import java.util.Scanner;

public class CalculateCirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What calculations should be performed?");
        System.out.print("Area or Perimeter?: ");
        String calculationType = scanner.nextLine();
        switch (calculationType) {
            case "Area":
                System.out.printf("Area is %.2f square centimeters", calculateCircleArea(scanner));
                break;
            case "Perimeter":
                System.out.printf("Perimeter is %.2f centimeters", calculateCirclePerimeter(scanner));
                break;
        }
    }

    public static double calculateCirclePerimeter(Scanner scanner){
        System.out.print("Input radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        while(validateInput(radius)){
            System.out.print("Radius cannot be zero or negative! ");
            System.out.print("Input radius: ");
            radius = Double.parseDouble(scanner.nextLine());
        }
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(Scanner scanner){
        System.out.print("Input radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        while(validateInput(radius)){
            System.out.println("Radius cannot be zero or negative! ");
            System.out.print("Input radius: ");
            radius = Double.parseDouble(scanner.nextLine());
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static boolean validateInput(double radius){
        return radius <= 0;
    }
}
