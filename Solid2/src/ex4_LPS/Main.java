package ex4_LPS;

import ex4_LPS.Shapes.Rectangle;
import ex4_LPS.Shapes.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.area());

        Square square = new Square();
        square.setLength(5);
        System.out.println(square.area());
    }
}