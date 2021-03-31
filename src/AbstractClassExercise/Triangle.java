package AbstractClassExercise;

public class Triangle extends Figura {

    String color = "blue";

    @Override
    public double getArea() {
        int triangleArea = triangleSite * triangleHeight;
        triangleArea = triangleArea / 2;
        return triangleArea;
    }

    @Override
    public String getParameter() {
        return color;
    }
}
