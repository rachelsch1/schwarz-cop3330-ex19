package ex19.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
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
