package Assignment1;

public class ApplesFactory extends AbstractFactory {
    @Override
    Fruits getFruit(String fruit) {
        if (fruit == null) {
            return null;
        }
        if (fruit.equalsIgnoreCase("APPLE")) {
            return new Apples();
        }
        return null;
    }
}

