package Square;

import java.util.Scanner;

public class CalculateSquarePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What calculations should be performed?");
        System.out.print("Area or Perimeter?: ");
        String calculationType = scanner.nextLine();
        switch (calculationType) {
            case "Area":
                System.out.printf("Area is %.2f square centimeters", calculateSquareArea(scanner));
                break;
            case "Perimeter":
                System.out.printf("Perimeter is %.2f centimeters", calculateSquarePerimeter(scanner));
                break;
        }
    }

    public static double calculateSquarePerimeter(Scanner scanner){

        double perimeter = 0;
            System.out.print("Input side 'a': ");
            double sideValue = Double.parseDouble(scanner.nextLine());
            while(!validateInput(sideValue)){
                System.out.print("Side 'a' cannot be zero or negative! ");
                System.out.print("Input side 'a': ");
                sideValue = Double.parseDouble(scanner.nextLine());
            }
            perimeter = 4 * sideValue;
        return perimeter;
    }

    public static double calculateSquareArea(Scanner scanner){
        System.out.print("Input side 'a': ");
        double side = Double.parseDouble(scanner.nextLine());
        while(!validateInput(side)){
            System.out.println("Side 'a' cannot be zero or negative! ");
            System.out.print("Input side 'a': ");
            side = Double.parseDouble(scanner.nextLine());
        }
        return side * side;
    }

    public static boolean validateInput(double sideValue){
        return !(sideValue <= 0);
    }
}
