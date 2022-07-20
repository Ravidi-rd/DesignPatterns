package FactoryDesignPattern;

public class LaptopTest {
    public static void main(String[] args)
    {
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.BrandLaptop("Asus");
        laptop.Brand();
    }
}
