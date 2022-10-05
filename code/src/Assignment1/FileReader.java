package Assignment1;
import java.io.*;

public class FileReader extends Reader {

    //Constructor
    public FileReader(String s) {
        String File = s;
    }
    //Read file and return price
    public int Read(String Fruit ){
    int [] price = new int[10];
    int i = 0;
    int k = 0;
    //csv reader
    try {
        BufferedReader br = new BufferedReader(new FileReader("src/Assignment1/Prices.csv"));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (values[0].equals(Fruit)) {
                price[i] = Integer.parseInt(values[1]);
                i++;
            }
        }
        br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }




    if (Fruit.equalsIgnoreCase("Apple") ){
         k = price[0];

    }
    if (Fruit.equalsIgnoreCase("Banana") ){
     k = price[1];
    }

    return k;
}

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}

