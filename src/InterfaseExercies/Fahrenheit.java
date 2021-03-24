package InterfaseExercies;

import java.util.Scanner;

public class Fahrenheit implements BaseConverter{

    @Override
    public String temperatureConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        int userTempInCelsius = scanner.nextInt();
        double fahrenheit = 33.8; // one celsius == 33.8 fahrenheita
        double oneCelsius = 1.8;
        double fahrenheitTemp = fahrenheit + (userTempInCelsius * oneCelsius);
        return "this is your temperature in fahrenheit: " + fahrenheitTemp;
    }
}
