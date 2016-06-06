package fly;

/**
 * 可以飞行的类
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
	
}