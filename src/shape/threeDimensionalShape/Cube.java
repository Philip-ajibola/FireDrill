package shape.threeDimensionalShape;

public class Cube extends ThreeDimensionalShape{
    private double length;

    @Override
    public double getArea(){
        return 6* Math.pow(length,2);
    }
    @Override
    public double getVolume(){
        return Math.pow(length,3);
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String toString(){
        return String.format("ThreeDimensionalShape:\nVolume of Cube: %.2f \n Area of Cube: %.2f",getVolume(),getArea());
    }

}
