package Triangle;

import java.util.Scanner;

public class CalculatePerimeterAndArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What calculations should be performed?");
        System.out.print("Area or Perimeter?: ");
        String calculationType = scanner.nextLine();
        switch (calculationType) {
            case "Area":
                System.out.printf("Area is %.2f square centimeters", calculateArea(scanner));
                break;
            case "Perimeter":
                System.out.printf("Perimeter is %.2f centimeters", calculatePerimeter(scanner));
                break;
        }
    }

    public static double calculatePerimeter(Scanner scanner){
        char side = 97;
        double perimeter = 0;
        for (int i = 1; i <= 3 ; i++) {
            System.out.printf("Input side '%c': ", side);
            double sideValue = Double.parseDouble(scanner.nextLine());
            while(!validateInput(sideValue)){
                    System.out.printf("Side '%c' cannot be zero or negative! ", side);
                    System.out.printf("Input side '%c': ", side);
                    sideValue = Double.parseDouble(scanner.nextLine());
            }
            perimeter += sideValue;
            side++;
        }
        return perimeter;
    }

    public static double calculateArea(Scanner scanner){
        System.out.print("Input base: ");
        double base = Double.parseDouble(scanner.nextLine());
        while(!validateInput(base)){
            System.out.println("Base cannot be zero or negative! ");
            System.out.print("Input base: ");
            base = Double.parseDouble(scanner.nextLine());
        }
        System.out.print("Input height: ");
        double height = Double.parseDouble(scanner.nextLine());
        while(!validateInput(height)){
            System.out.println("Height cannot be zero or negative! ");
            System.out.print("Input height: ");
            height = Double.parseDouble(scanner.nextLine());
        }
        return (base * height) / 2;
    }

    public static boolean validateInput(double sideValue){
        return !(sideValue <= 0);
    }
}
