package InterfaseExercies;

public class Fahrenheit implements BaseConverter {

    @Override
    public double temperatureConverter(double tempInCelsius) {
        return oneCelsiusToFahrenheit + (tempInCelsius * 1.8);
    }
}

