package AbstractClassExercise;

public class Circle extends  Figura {

    private static final double piNumber = 3.1415;

    public Circle (int site, Colors colors) {
        super.site = site;
        this.colors = colors;
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

}
