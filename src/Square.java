public class Square extends Rectangle{
    public Square(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public String toString() {
        return  super.toString() + "; сторона: " + width;
    }
}
