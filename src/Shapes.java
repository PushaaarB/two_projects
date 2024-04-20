public class Shapes {
    public static void main(String[] args) {
        BaseRectangle rect = new BaseRectangle(12.5,3);
        Square square = new Square(5);
        BaseEllipse ellipse = new BaseEllipse(10, 4.5);
        Circle circle = new Circle(1);

        rect.setColor("красный");
        circle.setFilled(true);
        square.setColor("жёлтый");

        System.out.println(rect.toString());
        System.out.println(square.toString());
        System.out.println(ellipse.toString());
        System.out.println(circle.toString());
    }
}