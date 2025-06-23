package task;

	import java.util.Scanner;

	public class SimpleCalculator {

	    // Method for Addition
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // Method for Subtraction
	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Method for Multiplication
	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Method for Division (returns -1 only if there's an error)
	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: Cannot divide by zero.");
	            return -1; // Just an indicator, won't be printed
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("  Java Console Calculator ");

	        while (true) {
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            System.out.print("Enter operator (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            double result = 0;
	            boolean valid = true;

	            switch (operator) {
	                case '+':
	                    result = add(num1, num2);
	                    break;
	                case '-':
	                    result = subtract(num1, num2);
	                    break;
	                case '*':
	                    result = multiply(num1, num2);
	                    break;
	                case '/':
	                    if (num2 == 0) {
	                        valid = false; // Skip result display
	                    } else {
	                        result = divide(num1, num2);
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid operator.");
	                    valid = false;
	            }

	            if (valid) {
	                System.out.println("Result: " + result);
	            }

	            System.out.print("Do you want to perform another calculation? (yes/no): ");
	            String choice = scanner.next();

	            if (!choice.equalsIgnoreCase("yes")) {
	                System.out.println("Calculator exited. Thank you!");
	                break;
	            }
	        }

	        scanner.close();
	    }
	}



