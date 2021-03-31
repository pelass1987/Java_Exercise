package AbstractClassExercise;

abstract class Figura {

    public int site;
    public String color;

    public abstract double getArea();

    public abstract double getPerimeter();

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




