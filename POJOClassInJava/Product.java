package POJOClassInJava;

//POJO Class ..

public class Product             //Rule 1 -> No extends and Implements any Class or Interface
{
    private int productId;
    private String productName;        //Rule 2-> Make All Fields Private
    private double productPrice;

    public Product()               //Rule 3-> Provide No-Argument Constructor
    {

    }

    public Product(int productId , String productName , double productPrice)
    {
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    //Rule 4-> Provide Getter and Setter


    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
