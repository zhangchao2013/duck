package fly;

/**
 * 使用火箭助推器进行飞行
 */
public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}