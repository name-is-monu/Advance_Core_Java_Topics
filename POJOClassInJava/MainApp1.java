package POJOClassInJava;

public class MainApp1
{
    static void main() {
        Product p1=new Product();
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setProductPrice(45000.400);

        System.out.println("Product Details :"+p1);
    }
}
