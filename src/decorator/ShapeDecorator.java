package decorator;

/**
 * Created by kaifashi on 2017/9/19.
 */
public class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
