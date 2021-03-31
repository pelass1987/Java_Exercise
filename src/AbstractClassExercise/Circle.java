package AbstractClassExercise;

public class Circle extends  Figura {

    private static final double piNumber = 3.1415;
    private String color = "Red";

    public Circle (int site) {
        super.site = site;
    }

    @Override
    public double getArea() {
        return piNumber * (site * site);
    }

    @Override
    public double getPerimeter() {
        double circlePerimeter = (piNumber * 2) * site;
        return circlePerimeter;
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
