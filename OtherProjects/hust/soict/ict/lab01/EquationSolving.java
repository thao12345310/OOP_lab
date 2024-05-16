package OtherProjects.hust.soict.ict.lab01;

import java.util.Scanner;

public class EquationSolving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. The first-degree equation (linear equation) with one variable");
            System.out.println("2. The system of first-degree equations (linear system) with two variables");
            System.out.println("3. The second-degree equation with one variable");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveFirstDegreeEquation();
                    break;
                case 2:
                    solveLinearSystem();
                    break;
                case 3:
                    solveSecondDegreeEquation();
                    break;
                case 4:
                    scanner.close();
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Choose again.");
            }
        }
    }

    private static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving first-degree equation: ax + b = 0");
        System.out.println("Enter a: ");
        int a =  scanner.nextInt();
        System.out.println("Enter b: ");
        int b =  scanner.nextInt();
        if(a == 0){
            if(b==0) System.out.println("Infinity solution");
            else System.out.println("No solution");
        }
        else {
            double sol = - b /a;
            System.out.println("The solution is: " + sol);
        }
    }

    private static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving linear system of equations (ax + by = c, dx + ey = f)");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        System.out.print("d = ");
        double d = scanner.nextDouble();
        System.out.print("e = ");
        double e = scanner.nextDouble();
        System.out.print("f = ");
        double f = scanner.nextDouble();

        double det = a * e - b * d;
        if (det == 0) {
            System.out.println("No unique solution.");
        } else {
            double x = (c * e - b * f) / det;
            double y = (a * f - c * d) / det;
            System.out.println("The solution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }

    private static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving second-degree equation (ax^2 + bx + c = 0)");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("This is not a second-degree equation.");
            scanner.close();
            return;
        }
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 roots:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root :");
            System.out.println("x = " + root);
        } else {
            System.out.println("There are no real root");
        }
    }
}
