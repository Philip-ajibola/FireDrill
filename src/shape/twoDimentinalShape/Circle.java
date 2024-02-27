package shape.twoDimentinalShape;

public class Circle extends TwoDimensionalShape {
    private int radius;
    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

