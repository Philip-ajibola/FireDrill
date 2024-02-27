package shape.threeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape{
    private double lengthOfEdges;

    @Override
    public double getVolume(){
        return (Math.pow(lengthOfEdges,3)*Math.sqrt(2))/12;
    }
    @Override
    public double getArea(){
        return Math.sqrt(3) * Math.pow(lengthOfEdges,2);
    }

}
