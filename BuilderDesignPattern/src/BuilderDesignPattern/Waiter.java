package BuilderDesignPattern;

public class Waiter {
	
	BurgerBuilder burgerBuilder;
	
	public Waiter(BurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}
	
	public Burger getBurger(){
		return burgerBuilder.getBurger();
	}
	
	public Waiter serve(){
		burgerBuilder.buildBurgerBase();
		burgerBuilder.buildBurgerTopping();
		return this;
	}

}
