package AbstractClassExercise;

public class Circle extends  Figura {

    String color = "green";

    @Override
    public double getArea() {
        return piNumber * (circleRadius * circleRadius);
    }

    @Override
    public String getParameter() {
        return color;
    }
}
