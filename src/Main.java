// Necessary library
import javax.swing.*;
import java.util.InputMismatchException;

public class Main{

    // Principal function
    public static void main(String[] args){

        int option1 = 0;
        int option2 = 0;
        double real = 0.0;

        // try to capture possible error
        try {

            // input the variables values
            option1 = Integer.parseInt(JOptionPane.showInputDialog("Please Select first temperature\n1. Celsius\n2. Fahrenheit\n3. Kelvin\n"));
            real = Double.parseDouble(JOptionPane.showInputDialog("Now the amount : \n"));
            option2 = Integer.parseInt(JOptionPane.showInputDialog("Please Select the unit to convert:\n1. Celsius\n2. Fahrenheit\n3. Kelvin\n"));

            // capture a possible exception when option1 is equal to option2
            if(option1 == option2) {
                JOptionPane.showMessageDialog(null, "Result : " + real);
                System.exit(0);

            // When option1 or option2 is out of the range, capture the exception
            } else if (option1 > 3 || option2 > 3 || option1 < 1 || option2 < 1) {
                JOptionPane.showMessageDialog(null, "Error,please, select correct values in range");
                main(args);
                System.exit(0);
            }

        // Capture the exception
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e + ", please, select correct values");
            main(args);
            System.exit(0);
        }

        // logic
        if (option1 == 1 && option2 == 2 ){ // Celsius to Fahrenheit
            double result = (real * 1.8) + 32;
            JOptionPane.showMessageDialog(null, "Celsius : "+ real + "\nFahrenheit : " + result);

        } else if (option1 == 1 && option2 == 3){ // Celsius to Kevin
            double result = (real + 273.15);
            JOptionPane.showMessageDialog(null,"Celsius : "+ real + "\nKelvin : " + result);

        }else if (option1 == 2 && option2 == 1) { // Fahrenheit to Celsius
            double result = (real - 32)/1.8;
            JOptionPane.showMessageDialog(null, "Fahrenheit : "+ real + "\nCelsius : " + result);

        } else if (option1 == 2 && option2 == 3) { // Fahrenheit to kelvin
            double result = (((real - 32)/1.8) + 273.15);
            JOptionPane.showMessageDialog(null,"Fahrenheit : "+ real + "\nKelvin : " + result );

        } else if (option1 == 3 && option2 == 1) { // Kevin to Celsius
            double result = (real - 273.15);
            JOptionPane.showMessageDialog(null,"Kevin : "+ real + "\nCelsius : " + result );

        } else if (option1 == 3 && option2 == 2) { // Kelvin to Fahrenheit
            double result = ((1.8)*(real - 273.15))+ 32;
            JOptionPane.showMessageDialog(null,"Kevin : "+ real + "\nFahrenheit : " + result );

        } else {
            System.out.print("Error");
        }
    }
}