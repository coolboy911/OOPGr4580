package ex4_LPS.Shapes;

public abstract class Shape {
    private int width;
    private int height;
    
    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
