package geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Geometry2D> geometry2DList = new LinkedList<>();
        LinkedList<Geometry3D> geometry3DList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String input;

        
        System.out.println("Commands: add2D, add3D, remove2D, remove3D, find2D, find3D, list2D, list3D, exit");

        while (true) {
            System.out.print("\nEnter a command: ");
            input = scanner.nextLine().trim();

            switch (input.toLowerCase()) {
                case "add2d":
                    System.out.print("Enter type (rectangle, circle, triangle): ");
                    String type2D = scanner.nextLine().trim().toLowerCase();

                    if (type2D.equals("rectangle")) {
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        geometry2DList.add(new Rectangle(width, height));
                        System.out.println("Rectangle added.");
                    } else if (type2D.equals("circle")) {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        geometry2DList.add(new Circle(radius));
                        System.out.println("Circle added.");
                    } else if (type2D.equals("triangle")) {
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        System.out.print("Enter sides A, B, and C: ");
                        double sideA = scanner.nextDouble();
                        double sideB = scanner.nextDouble();
                        double sideC = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        geometry2DList.add(new Triangle(base, height, sideA, sideB, sideC));
                        System.out.println("Triangle added.");
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;

                case "add3d":
                    System.out.print("Enter type (sphere, triangularprism): ");
                    String type3D = scanner.nextLine().trim().toLowerCase();

                    if (type3D.equals("sphere")) {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        geometry3DList.add(new Sphere(radius));
                        System.out.println("Sphere added.");
                    } else if (type3D.equals("triangularprism")) {
                        System.out.print("Enter base area: ");
                        double baseArea = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        geometry3DList.add(new TriangularPrism(baseArea, height));
                        System.out.println("TriangularPrism added.");
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;

                case "remove2d":
                    System.out.print("Enter index to remove: ");
                    int index2D = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    try {
                        Geometry2D removed2D = geometry2DList.find(index2D);
                        geometry2DList.remove(removed2D);
                        System.out.println("2D Geometry removed.");
                    } catch (Exception e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "remove3d":
                    System.out.print("Enter index to remove: ");
                    int index3D = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    try {
                        Geometry3D removed3D = geometry3DList.find(index3D);
                        geometry3DList.remove(removed3D);
                        System.out.println("3D Geometry removed.");
                    } catch (Exception e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "find2d":
                    System.out.print("Enter index to find: ");
                    int findIndex2D = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    try {
                        System.out.println("Found: " + geometry2DList.find(findIndex2D));
                    } catch (Exception e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "find3d":
                    System.out.print("Enter index to find: ");
                    int findIndex3D = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    try {
                        System.out.println("Found: " + geometry3DList.find(findIndex3D));
                    } catch (Exception e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "list2d":
                    System.out.println("2D Geometries:");
                    geometry2DList.display();
                    break;

                case "list3d":
                    System.out.println("3D Geometries:");
                    geometry3DList.display();
                    break;

                case "exit":
                    System.out.println("Exiting Geometry Manager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
