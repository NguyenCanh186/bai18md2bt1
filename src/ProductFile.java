import java.io.*;
import java.util.ArrayList;

public class ProductFile {
    public static void writeFile(ArrayList<Product> listProduct) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("list.product");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            oos.close();
            fos.close();
        }
    }
    public static ArrayList<Product> readFile(){
        File file = new File("list.product");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            ArrayList<Product> a = (ArrayList<Product>)result;
            return a;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
