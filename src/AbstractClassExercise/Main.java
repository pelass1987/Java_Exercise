package AbstractClassExercise;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(5, "Red");
        Triangle triangle = new Triangle(4, 7, "Blue");
        Circle circle = new Circle(10, "Green");

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square.switchColor());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.switchColor());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.switchColor());

    }
}
