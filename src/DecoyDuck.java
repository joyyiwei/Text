/**
 * Created by acer on 14-6-7.
 */
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
       System.out.println("I'm a duck Decoy!!");
    }
}
