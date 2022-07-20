package BuilderDesignPattern;

public class BuilderTest {


	public static void main(String[] args) {
		
		Waiter waiterGrade1 = new Waiter(new ChickenBurgerBuilder()).serve();
		System.out.println();
		Waiter waiterGrade2 = new Waiter(new VeggieBurgerBuilder()).serve();
		
		
		
	}

}
