package ex19.base;

/* You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.
Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex19 {
    private static DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        double height = 0;
        double weight = 0;

        while(!isValid) {
            System.out.print("What is your height in inches? ");
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isValid = true;
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
            input.nextLine();
        }

        isValid = false;
        while(!isValid) {
            System.out.print("What is your weight in pounds? ");
            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isValid = true;
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
            input.nextLine();
        }

        double bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + df.format(bmi) + ".");

        if(bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if((bmi >= 18.5) && (bmi <= 25)) {
            System.out.println("You are within the idea weight range.");
        }
    }
}
