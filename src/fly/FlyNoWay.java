package fly;

/**
 * 不能飞行的类
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}