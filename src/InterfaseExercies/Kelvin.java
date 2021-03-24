package InterfaseExercies;

import java.util.Scanner;

public class Kelvin implements BaseConverter{

    @Override
    public String temperatureConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        int userTempInCelsius = scanner.nextInt();
        int kelvin = 3;
        int kelvinTemp = kelvin * userTempInCelsius;
        return "This is your temperature in kelvin: " + kelvinTemp;
    }
}
