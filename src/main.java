import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Method a = new Method();
        a.listProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. them san pham");
        System.out.println("2. tim kiem san pham");
        System.out.println("nhap lua chon cua ban: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                a.addProduct();
                break;
            case 2:
                a.searchProduct();
                break;
        }

    }
}
