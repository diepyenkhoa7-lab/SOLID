package lab_solid.lsp;

public class Square implements Shape {
    private int side;

    public Square(int s) {
        this.side = s;
    }

    public void setSide(int s) {
        this.side = s;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
