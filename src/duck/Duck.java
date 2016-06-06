package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

/**
 * Ѽ�ӵĳ�����
 * ʹ����ϵķ�ʽ��ʱ���ʹ�ü̳еķ�ʽ���Ӻ�
 */
public abstract class Duck {
	FlyBehavior flyBehavior;//������Ϊ
	QuackBehavior quackBehavior;//�е���Ϊ
	
	/**
	 * Ѽ�ӵ���ò
	 */
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}