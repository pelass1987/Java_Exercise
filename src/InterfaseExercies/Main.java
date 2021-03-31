package InterfaseExercies;

public class Main  {

    public static void main(String[] args) {
        Celsjusza celsjusza = new Celsjusza();
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();

        double temp = 34.8;

        System.out.println(kelvin.temperatureConverter(temp));
        System.out.println(celsjusza.temperatureConverter(temp));
        System.out.println(fahrenheit.temperatureConverter(temp));
    }
}

