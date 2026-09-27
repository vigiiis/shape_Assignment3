import geometry.Shape;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Square;

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 5);
        Shape s = new Square(4);

        System.out.println("Circle Area = " + c.Area());
        System.out.println("Rectangle Area = " + r.Area());
        System.out.println("Square Area = " + s.Area());
    }
}