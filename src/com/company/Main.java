package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int quotient  (int numerator, int denominator) throws ArithmeticException {
        return numerator/denominator;
    }

    public static double quotient(double numerator, double denominator){
        return numerator/denominator;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean continueLoop=true;

        do{

            try {

                System.out.println(" Enter int numerator: ");
                int numerator = scanner.nextInt();

                System.out.println(" Enter int denominator: ");
                int denominator = scanner.nextInt();

                double result2 = quotient((double) numerator, (double) denominator);
                System.out.println("quotient2=" + result2);

                int result = numerator / denominator;
                System.out.println("Wynik: " + result);
                continueLoop=false;
            }
            catch (ArithmeticException arithmeticException){
                System.out.println("Denominator must not be zero");
            }
            catch (InputMismatchException inputMismatchException){
                System.out.println("Inputs have to be numbers");
               // scanner.nextLine();
            }

        } while (continueLoop);




    }
}
