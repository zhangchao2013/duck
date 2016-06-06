package duck;

import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import fly.FlyRocketPowered;

/**
 * 测试类
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println("------------------");
		Duck model = new ModelDuck();
		model.performFly();
		//让不会飞的模型鸭子使用助推器
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	/**
	 * 运行结果：
	 *  I'm flying!
		Quack
		------------------
		I can't fly
		I'm flying with a rocket
	 */
}