
package exceptionhandling;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExceptionHandling_1 {
    public static void main(String[] args) {
        int count = 1;
        
        do {
            try {
                DecimalFormat ob = new DecimalFormat("0.000");
                Scanner input = new Scanner(System.in);
                
                System.out.print("Enter first number: ");
                double num1 = input.nextInt();
                
                System.out.print("Enter second number: ");
                double num2 = input.nextInt();
                
                double result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + ob.format(result));
                
                count++;
            }
            catch(Exception e) {
                System.out.println("Exception: " +e);
                System.out.println("Please enter number. Try again.");
                System.out.println();
            }
        }
        while(count == 1);
    }
}
