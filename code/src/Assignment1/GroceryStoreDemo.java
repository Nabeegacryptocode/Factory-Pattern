package Assignment1;
import java.io. * ;
import java.util.Scanner;
public class GroceryStoreDemo {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader();
        AbstractFactory fruitFactory = FactoryProducer.getFactory("Banana");
     AbstractFactory fruitFactory2 = FactoryProducer.getFactory("Apple");
       Fruits fruit1 = fruitFactory.getFruit("Banana");
       fruit1.setPrice(fileReader.readFile("Banana"));
       Fruits fruit2 = fruitFactory2.getFruit("Apple");
        fruit2.setPrice(fileReader.readFile("Apple"));
        System.out.println("Bananas cost $ " + fruit1.getPrice());
        System.out.println("Apples cost $ " + fruit2.getPrice());


    }
}




