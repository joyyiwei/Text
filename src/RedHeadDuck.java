/**
 * Created by acer on 14-6-7.
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
       System.out.println("I'm a real Red Headed Duck!!");
    }
}
