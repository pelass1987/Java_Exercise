package AbstractClassExercise;

public class Triangle extends Figura {

    private int triangleHeight;
    private String color = "Green";
    public Triangle(int site, int triangleHeight){
        super.site = site;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getArea() {
        int triangleArea = site * triangleHeight;
        triangleArea = triangleArea / 2;
        return triangleArea;
    }

    @Override
    public double getPerimeter() {
        double trainglePerimeter = site * 3;
        return trainglePerimeter;
    }

    @Override
    public String switchColor() {

        switch (color) {
            case "Green":
                color = "#44975c";
                break;
            case "Blue":
                color = "#40c0ff";
                break;
            case "Red":
                color = "#ff0000";
                break;
            default:
                color = "Invalid color";
        }
        return color;
    }
}
