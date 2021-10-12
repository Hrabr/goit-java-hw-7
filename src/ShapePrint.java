public class ShapePrint {
    public void printShape(Shape shape) {
        shape.print();
    }

    public static void main(String[] args) {
        new ShapePrint().printShape(new Circle());
    }
}
