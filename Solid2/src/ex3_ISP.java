public class ex3_ISP {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Cube cube = new Cube(1);
        System.out.println(circle.area());
        // System.out.println(circle.volume());  // IDE подсвечивает ошибку
        System.out.println(cube.area());
        System.out.println(cube.volume());
    }
}

/*
interface Shape {
    double area();
    double volume();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException();
    }
}

class Cube implements Shape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
*/

interface Area {
    double area();
}
interface Volume {
    double volume();
}

class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

class Cube implements Area, Volume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
