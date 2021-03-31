package AbstractClassExercise;

public class Square extends Figura {

    String color = "red";

    @Override
    public double getArea() {
        int squareArea = squareSite * 4;
        return squareArea;
    }

    @Override
    public String getParameter() {
        return color;
    }
}
