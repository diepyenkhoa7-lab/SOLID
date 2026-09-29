package lab_solid.lsp;

public class MainLSP {
    public static void printArea(Shape s) {
        System.out.println("Hinh: " + s.getClass().getSimpleName() + " | Dien tich: " + s.getArea());
    }

    public static void main(String[] args) {
        Shape r = new Rectangle(5, 4);
        Shape s = new Square(5);

        System.out.println("=== KIEM THU LSP ===");
        printArea(r);
        printArea(s);
    }
}
