package AbstractClassExercise;

abstract class Figura {

    public int site;
    public Colors colors;

    public abstract double getArea();

    public abstract double getPerimeter();

    public Colors switchColor() {

        switch (colors) {
            case GREEN:
                System.out.println("#v34354");
                break;
            case BLUE:
                System.out.println("#djrg56");
                break;
            case RED:
                System.out.println("#ff0000");
                break;
        }
        return Colors.valueOf(colors.name());
    }
}




