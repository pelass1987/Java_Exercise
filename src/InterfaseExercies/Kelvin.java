package InterfaseExercies;

import java.util.Scanner;

public class Kelvin implements BaseConverter{

    @Override
    public String temperatureConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        int userTempInCelsius = scanner.nextInt();
        double celsius = 274.15; // one celsius == 274.15 kelvin
        double kelvinTemp = celsius + userTempInCelsius ;
        return "This is your temperature in kelvin: " + kelvinTemp;
    }
}
