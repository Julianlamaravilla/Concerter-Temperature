import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option1 = 0;
        int option2 = 0;
        double real = 0.0;


        try {
            System.out.println("Please Select first temperature\n1. Celsius\n2. Fahrenheit\n3. Kelvin\n");
            option1 = scanner.nextInt();
            System.out.println("Now the amount : \n");
            real = scanner.nextDouble();
            System.out.println("Please Select the unit to convert:\n1. Celsius\n2. Fahrenheit\n3. Kelvin\n");
            option2 = scanner.nextInt();

            if(option1 == option2) {
                System.out.println("Result : " + real);
                System.exit(0);
            } else if (option1 > 3 || option2 > 3 || option1 < 1 || option2 < 1) {
                System.out.print("Error,please, select correct values in range");
                main(args);
                System.exit(0);
            }

        } catch (InputMismatchException e) {
            System.out.print("Error: " + e + ", please, select correct values");
            main(args);
            System.exit(0);
        }

        // logic
        if (option1 == 1 && option2 == 2 ){ // Celsius to Fahrenheit
            double result = (real * 1.8) + 32;
            System.out.println("Celsius : "+ real + "\nFahrenheit : " + result);
        } else if (option1 == 1 && option2 == 3){ // Celsius to Kevin
            double result = (real + 273.15);
            System.out.println("Celsius : "+ real + "\nKelvin : " + result);
        }else if (option1 == 2 && option2 == 1) { // Fahrenheit to Celsius
            double result = (real - 32)/1.8;
            System.out.println("Fahrenheit : "+ real + "\nCelsius : " + result);
        } else if (option1 == 2 && option2 == 3) { // Fahrenheit to kelvin
            double result = (((real - 32)/1.8) + 273.15);
            System.out.println("Fahrenheit : "+ real + "\nKelvin : " + result);
        } else if (option1 == 3 && option2 == 1) { // Kevin to Celsius
            double result = (real - 273.15);
            System.out.println("Kevin : "+ real + "\nCelsius : " + result);
        } else if (option1 == 3 && option2 == 2) { // Kelvin to Fahrenheit
            double result = ((1.8)*(real - 273.15))+ 32;
            System.out.println("Kevin : "+ real + "\nFahrenheit : " + result);
        } else {
            System.out.print("Error");
        }
    }
}