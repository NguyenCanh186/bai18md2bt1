import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    public static ArrayList<Product> products = ProductFile.readFile();
    public void listProduct(){
        Product p1 = new Product(1, "iPhone", 1000000);
        Product p2 = new Product(2, "SamSung", 2000000);
        Product p3 = new Product(3, "Oppo", 3000000);

        products.add(p1);
        products.add(p2);
        products.add(p3);


        System.out.println("danh sach san pham: ");
        for (Product p: products
             ) {
            System.out.println(p.toString());
        }
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id: ");
        int id = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String name = scanner2.nextLine();
        System.out.println("nhap gia: ");
        int cost = scanner.nextInt();
        Product newProduct = new Product();
        newProduct.setId(id);
        newProduct.setName(name);
        newProduct.setCost(cost);
        products.add(newProduct);
        try {
            ProductFile.writeFile(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten san pham muon tim: ");
        String name  = scanner.nextLine();
        int index = -1;
        int size = products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("khong co san pham ban muon tim!");
        } else {
            System.out.println(products.get(index).toString());
        }
    }
}
