package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

/**
 * 鸭子的抽象类
 * 使用组合的方式有时候比使用继承的方式更加好
 */
public abstract class Duck {
	FlyBehavior flyBehavior;//飞行行为
	QuackBehavior quackBehavior;//叫的行为
	
	/**
	 * 鸭子的外貌
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