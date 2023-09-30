import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class database {
    public String[] queryID(int id){
        String[] productDetails = new String[2];
        try {
            File dataFile = new File("./database.txt");
            Scanner read = new Scanner(dataFile);

            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] columns = line.split(" ");
                int productID = Integer.parseInt(columns[0]);
                if(productID == id) {
                    productDetails[0] = columns[1];
                    productDetails[1] = columns[2];
                    return productDetails;
                }
            }
            read.close();    
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong in reading file");
            e.printStackTrace();
        }
        return null;
    }
}
