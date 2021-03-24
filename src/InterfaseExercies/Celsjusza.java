package InterfaseExercies;

import java.util.Scanner;

public class Celsjusza implements BaseConverter{

    @Override
    public String temperatureConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        int userTempInCelsius = scanner.nextInt();
        return "This is your temperature in celsius: " + userTempInCelsius;
    }
}
