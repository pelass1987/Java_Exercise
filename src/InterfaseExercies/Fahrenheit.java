package InterfaseExercies;

import java.util.Scanner;

public class Fahrenheit implements BaseConverter{

    @Override
    public String temperatureConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        int userTempInCelsius = scanner.nextInt();
        int fahrenheit = 10;
        int fahrenheitTemp = fahrenheit * userTempInCelsius;
        return "this is your temperature in fahrenheit: " + fahrenheitTemp;
    }
}
