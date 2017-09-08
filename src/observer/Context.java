package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaifashi on 2017/9/4.
 */
public class Context {

    List<Observer> observerList = null;


    public void register(Observer observer) {
        if (observerList == null) {
            observerList = new ArrayList<>();
        }
        observerList.add(observer);
    }

    public void unregister(Observer observer){
        if(observerList!=null){
            this.observerList.remove(observer);
        }
    }

    public void invoke() {
        if (observerList != null) {
            for (Observer observer : observerList) {
                observer.update();
            }
        }
    }
}
