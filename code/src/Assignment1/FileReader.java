package Assignment1;
import java.io. * ;
import java.util.Scanner;
public class FileReader {

    public FileReader(){
    }

    public double readFile(String fruit) throws Exception {
        int i = 0;
        double[] prices = new double[2];
        File file = new File("/Users/new/Desktop/Assignment1-0-2/src/Assignment1/prices.txt");
        Scanner sc = new Scanner(file);
        double j = 0;
        while (sc.hasNextLine()&& i < 2) {
            prices[i] = Double.parseDouble(sc.nextLine());
            i++;
        }
        if (fruit.equalsIgnoreCase("Banana")) {
            j = prices[0];
        } else if (fruit.equalsIgnoreCase("Apple")) {
            j = prices[1];
        }

        //closes the scanner
        return j;
    }
}

