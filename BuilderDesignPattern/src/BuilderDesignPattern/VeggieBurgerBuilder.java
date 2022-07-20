package BuilderDesignPattern;

public class VeggieBurgerBuilder extends BurgerBuilder {
	
	Burger burger;
	
	public VeggieBurgerBuilder() {
		burger = new Burger();
	}



	@Override
	public void buildBurgerBase() {
		System.out.println("Building Veggie Burger base");
		burger.setName("Veggie Burger");

	}

	@Override
	public void buildBurgerTopping() {
		System.out.println("Add Veggie Burger Topping");
		burger.setSauce("Burger sauce");

	}

	@Override
	public Burger getBurger() {
		System.out.println("Returning Veggie Burger");
		return this.burger;
	}

}
