package AbstractClassExercise;

public class Square extends Figura {


    public Square(int site, Colors colors) {
        this.site = site;
        this.colors = colors;
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



}
