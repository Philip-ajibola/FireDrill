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

}
