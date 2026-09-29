package lab_solid.lsp;

public class Rectangle implements Shape {
    protected int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
