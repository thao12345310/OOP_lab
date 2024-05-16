package OtherProjects.hust.soict.ict.lab01;

import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum: " + sum);

        double dif = num1 - num2;
        System.out.println("The difference: " + dif);

        double mul = num1 * num2;
        System.out.println("The product: " + mul);

        if(num2 != 0){
            double div = num1 / num2;
            System.out.println("The quotient: " + div);
        }
        else{
            System.out.println("Can not division for zero!");
        }
        scanner.close();
    }
}
