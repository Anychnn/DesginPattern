package mediator;

/**
 * Created by kaifashi on 2017/9/6.
 */
public class Tenant extends Person {


    @Override
    public void receiveMsg(String msg) {
        System.out.println("tenant receive:"+msg);
    }
}
