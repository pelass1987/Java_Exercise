package AbstractClassExercise;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        System.out.println(square.getParameter());
        System.out.println(square.getArea());
        System.out.println(triangle.getParameter());
        System.out.println(triangle.getArea());
        System.out.println(circle.getParameter());
        System.out.println(circle.getArea());

    }
}
