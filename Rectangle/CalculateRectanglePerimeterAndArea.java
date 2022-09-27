package Rectangle;

import java.util.Scanner;

public class CalculateRectanglePerimeterAndArea {
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
        for (int i = 1; i <= 2 ; i++) {
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
        perimeter = perimeter * 2;
        return perimeter;
    }

    public static double calculateArea(Scanner scanner){
        System.out.print("Input side `a`: ");
        double sideA = Double.parseDouble(scanner.nextLine());
        while(!validateInput(sideA)){
            System.out.println("Side `a` cannot be zero or negative! ");
            System.out.print("Input side `a`: ");
            sideA = Double.parseDouble(scanner.nextLine());
        }
        System.out.print("Input side 'b': ");
        double sideB = Double.parseDouble(scanner.nextLine());
        while(!validateInput(sideB)){
            System.out.println("Side 'b' cannot be zero or negative! ");
            System.out.print("Input side 'b': ");
            sideB = Double.parseDouble(scanner.nextLine());
        }
        return sideA * sideB;
    }

    public static boolean validateInput(double sideValue){
        return !(sideValue <= 0);
    }
}
