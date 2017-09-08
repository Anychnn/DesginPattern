package mediator;

/**
 * Created by kaifashi on 2017/9/5.
 */
public class ConcreteMediator extends Mediator {

    private HouseOwner houseOwner=null;
    private Tenant tenant=null;

    public void registerHouseOwner(HouseOwner houseOwner){
        this.houseOwner=houseOwner;
    }

    public void registerTenant(Tenant tenant){
        this.tenant=tenant;
    }

    public void sendMsgToHouseOwner(String msg){
        tenant.sendMsg(msg,houseOwner);
    }
    public void sendMsgToTenant(String msg){
        houseOwner.sendMsg(msg,tenant);
    }
}
