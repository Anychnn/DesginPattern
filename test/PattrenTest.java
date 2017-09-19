import decorator.*;
import mediator.ConcreteMediator;
import mediator.HouseOwner;
import mediator.Tenant;
import observer.Context;
import org.junit.Test;

/**
 * Created by kaifashi on 2017/9/5.
 */
public class PattrenTest {

    @Test
    public void mediatorTest(){
        ConcreteMediator mediator =new ConcreteMediator();
        HouseOwner houseOwner=new HouseOwner();
        Tenant tenant=new Tenant();
        mediator.registerHouseOwner(houseOwner);
        mediator.registerTenant(tenant);
        mediator.sendMsgToTenant("hello ! i want to rent the house.");
        mediator.sendMsgToHouseOwner("a tenant wants to rent your house");
    }


    @Test
    public void decoratorTest(){
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();

        Shape redCircle=new RedShapeDecorator(circle);
        redCircle.draw();

        Shape rotateRectangle=new RotateDecorator(rectangle);
        rotateRectangle.draw();
    }
}
