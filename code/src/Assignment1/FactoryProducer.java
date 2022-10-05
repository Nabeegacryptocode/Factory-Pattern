package Assignment1;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Apple")) {
            return new ApplesFactory();
        } else if (choice.equalsIgnoreCase("Banana")) {
            return new BananaFactory();
        }
        return null;
    }
}
