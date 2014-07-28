/**
 * Created by acer on 14-6-7.
 */
public class MiniDuckSimulator {
    public static void main(String args[]) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
    }
}
