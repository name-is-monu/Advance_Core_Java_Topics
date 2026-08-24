package JavaReflexionAPI;


public class Product
{
    private  String name;
    private  double price;
    private String brand;
    private  String quantity;

    public Product(){}

    public Product(String name , double price , String brand , String quantity)
    {
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
