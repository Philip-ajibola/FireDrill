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
    public String toString(){
        return String.format("TwoDimensionalShape:\nArea of Square: %.2f",getArea());
    }

}
