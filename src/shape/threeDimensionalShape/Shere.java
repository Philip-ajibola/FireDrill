package shape.threeDimensionalShape;

public class Shere extends ThreeDimensionalShape{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4*Math.PI*radius;
    }
    @Override
    public double getVolume(){
        return (4/3.0)*Math.PI*Math.pow(radius,3);
    }
}
