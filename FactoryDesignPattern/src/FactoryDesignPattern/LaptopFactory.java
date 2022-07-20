package FactoryDesignPattern;

public class LaptopFactory {
    public Laptop BrandLaptop(String brand)
    {
        if (brand == null || brand.isEmpty())
            return null;
        switch (brand) {
            case "Acer":
                return new Acer();
            case "Asus":
                return new Asus();
            case "Dell":
                return new Dell();
            case "Mac":
                return new Mac();
            default:
                throw new IllegalArgumentException("Unknown brand "+brand);
        }
    }


}
