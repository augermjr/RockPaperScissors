import java.util.Scanner;
public class NumCompare {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first number to compare: ");
        if (!in.hasNextDouble()) {
            System.out.println("Please try again and input numbers only.");
        }
        else if (in.hasNextDouble()) {
            double num1 = in.nextDouble();
            System.out.println("Enter the second number to compare: ");
            if (!in.hasNextDouble()) {
                System.out.println("Please try again and input numbers only.");
            }
            else {
                double num2 = in.nextDouble();
                if (num1 == num2) {
                    System.out.println(num1 + " and " + num2 + " are equal!");
                }
                else if (num1 < num2) {
                    System.out.println(num1 + " is less than " + num2);
                }
                else if (num2 < num1) {
                    System.out.println(num2 + " is less than " + num1);
                }
            }
        }
    }
}