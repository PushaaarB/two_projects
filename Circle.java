public class Circle extends Ellipse{
    public Circle(double r) {
        this.r1 = r;
        this.r2 = r;
    }

    @Override
    public String toString() {
        return  super.toString() + "; R: " + r1;
    }
}
