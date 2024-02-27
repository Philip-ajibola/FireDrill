package shape.twoDimentinalShape;

public class Square extends TwoDimensionalShape{
    private double length;
    @Override
    public double getArea(){
        return length * length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
