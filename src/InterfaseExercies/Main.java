package InterfaseExercies;

public class Main {

    public static void main(String[] args) {
        Celsjusza celsjusza = new Celsjusza();
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println(celsjusza.temperatureConverter());
        System.out.println(kelvin.temperatureConverter());
        System.out.println(fahrenheit.temperatureConverter());

    }
}
