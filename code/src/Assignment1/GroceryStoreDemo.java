package Assignment1;
import java.util.Scanner;
public class GroceryStoreDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractFactory fruitFactory = FactoryProducer.getFactory("Banana");
        AbstractFactory fruitFactory2 = FactoryProducer.getFactory("Apple");
        Fruits fruit1 = fruitFactory.getFruit("Banana");
        System.out.println("Enter the price of the bananas");
        double price1 = sc.nextDouble();
        fruit1.setPrice(price1);
        Fruits fruit2 = fruitFactory2.getFruit("Apple");
        System.out.println("Enter the price of the Apples");
        double price2 = sc.nextDouble();
        fruit2.setPrice(price2);
        System.out.println("Assignment1.Bananas cost $" + fruit1.getPrice());
        System.out.println("Assignment1.Apples cost $" + fruit2.getPrice());
    }
}
