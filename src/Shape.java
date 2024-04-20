public abstract class Shape {
    private String color;
    private boolean filled;

    public void setColor(String color) {this.color = color;}
    public void setFilled(boolean filled) {this.filled = filled;}

    public String getColor() {return color;}
    public boolean isFilled() {return filled;}

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Цвет: " + color + "; периметр: " + getPerimeter() + "; площадь: " + getArea() + "; закрашена? " + filled;
    }
}
