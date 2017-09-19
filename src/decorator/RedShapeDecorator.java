package decorator;

/**
 * Created by kaifashi on 2017/9/19.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRed(shape);
        super.draw();
    }

    private void setRed(Shape shape){
        System.out.println("set color : red");
    }
}
