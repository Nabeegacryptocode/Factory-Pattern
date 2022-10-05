package Assignment1;

public class BananaFactory extends AbstractFactory {
    @Override
    Fruits getFruit(String fruit) {
        if (fruit == null) {
            return null;
        }
        if (fruit.equalsIgnoreCase("BANANA")) {
            return new Bananas();
        }
        return null;
    }
}


