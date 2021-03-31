package InterfaseExercies;

public class Kelvin implements BaseConverter {

    @Override
    public double temperatureConverter(double tempInCelsius) {
        return oneCelsiusToKelvin + tempInCelsius;
    }
}

