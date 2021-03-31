package AbstractClassExercise;

public class Square extends Figura {

    private String color = "Blue";

    public Square(int site) {
        super.site = site;
    }

    @Override
    public double getArea() {
        int squareArea = site * 4;
        return squareArea;
    }

    @Override
    public double getPerimeter() {
       double squarePerimeter = site * 4;
       return squarePerimeter;
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
