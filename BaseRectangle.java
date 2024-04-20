public class BaseRectangle extends Rectangle{
    public BaseRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return  super.toString() + "; ширина: " + width + "; высота: " + height;
    }
}
