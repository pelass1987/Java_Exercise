package AbstractClassExercise;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(5,Colors.GREEN );
        Triangle triangle = new Triangle(4, 7,Colors.BLUE);
        Circle circle = new Circle(10, Colors.RED);

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
