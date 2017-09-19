package decorator;

/**
 * Created by kaifashi on 2017/9/19.
 */
public class RotateDecorator extends ShapeDecorator {
    public RotateDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        rotate(shape);
        super.draw();
    }

    private void rotate(Shape shape){
        System.out.println("begin to rotate");
    }
}
