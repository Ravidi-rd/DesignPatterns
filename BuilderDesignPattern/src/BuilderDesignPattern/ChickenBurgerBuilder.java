package BuilderDesignPattern;

public class ChickenBurgerBuilder extends BurgerBuilder {
	
	Burger burger;
	
	public ChickenBurgerBuilder() {
		burger = new Burger();
	}

	@Override
	public void buildBurgerBase() {
		System.out.println("Building the Chicken Burger base");
		burger.setName("Chicken Burger");
	}

	@Override
	public void buildBurgerTopping() {
		System.out.println("Add Chicken Burger Topping");
		burger.setSauce("Chicken flavoured sauce");
	}



	@Override
	public Burger getBurger() {
		System.out.println("Returning Chicken Burger");
		return this.burger;
	}
}
