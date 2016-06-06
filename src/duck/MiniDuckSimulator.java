package duck;

import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import fly.FlyRocketPowered;

/**
 * ������
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println("------------------");
		Duck model = new ModelDuck();
		model.performFly();
		//�ò���ɵ�ģ��Ѽ��ʹ��������
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	/**
	 * ���н����
	 *  I'm flying!
		Quack
		------------------
		I can't fly
		I'm flying with a rocket
	 */
}