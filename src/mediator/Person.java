package mediator;

/**
 * Created by kaifashi on 2017/9/6.
 */
public abstract class Person {

    public void sendMsg(String msg,Person to){
        to.receiveMsg(msg);
    }
    public abstract void receiveMsg(String msg);
}
