/**
 * Created by acer on 14-6-7.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I'm a model Duck");
    }
}
