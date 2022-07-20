package BuilderDesignPattern;

public abstract class BurgerBuilder {
	
	public abstract void buildBurgerBase();
	
	public abstract void buildBurgerTopping();
	
	public abstract Burger getBurger();

}
