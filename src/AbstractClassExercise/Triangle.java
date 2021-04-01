package AbstractClassExercise;

public class Triangle extends Figura {

    private int triangleHeight;

    public Triangle(int site, int triangleHeight, Colors colors){
        super.site = site;
        this.triangleHeight = triangleHeight;
        this.colors = colors;
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

}
