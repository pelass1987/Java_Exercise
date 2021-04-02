package AbstractClassExercise;

abstract class Figura {

    public int site;
    public Colors colors;

    public abstract double getArea();

    public abstract double getPerimeter();

    public String switchColor() {

        switch (colors) {
            case GREEN:
                return "#v34354";
            case BLUE:
                return "#djrg56";
            case RED:
                return "#ff0000";
        }
        return String.valueOf(colors);
    }
}




