package shape.threeDimensionalShape;

import shape.twoDimentinalShape.Circle;

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

    public void setLengthOfEdges(double lengthOfEdges) {
        this.lengthOfEdges = lengthOfEdges;
    }
    public String toString(){
        return String.format("ThreeDimensionalShape:\nVolume of Tetrahedon: %.2f \n Area of Tetrahedon: %.2f",getVolume(),getArea());
    }
}
