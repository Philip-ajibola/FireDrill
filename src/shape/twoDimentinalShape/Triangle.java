package shape.twoDimentinalShape;

public class Triangle extends TwoDimensionalShape{
    private double base;
    private double height;

    @Override
    public double getArea(){
        return (1/2.0) *base*height;
    }

}
