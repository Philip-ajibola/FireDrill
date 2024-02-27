package shape;

import shape.threeDimensionalShape.Cube;
import shape.threeDimensionalShape.Shere;
import shape.threeDimensionalShape.Tetrahedron;
import shape.twoDimentinalShape.Circle;
import shape.twoDimentinalShape.Square;
import shape.twoDimentinalShape.Triangle;
import shape.twoDimentinalShape.TwoDimensionalShape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        Circle circle = new Circle();
        circle.setRadius(5);
        Triangle triangle = new Triangle();
        triangle.setBase(6);
        triangle.setHeight(5);
        Square square = new Square();
        square.setLength(4);
        Shere shere = new Shere();
        shere.setRadius(5);
        Tetrahedron tetrahedron = new Tetrahedron();
        tetrahedron.setLengthOfEdges(6);
        Cube cube = new Cube();
        cube.setLength(4);
        shapes[0] = triangle;
        shapes[1] = circle;
        shapes[2] = square;
        shapes[3] = shere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;
        for(Shape shape1: shapes){

        }

    }
}
