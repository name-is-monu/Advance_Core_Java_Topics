package EnumInjava;

public enum OrderStatus
{
    //By default public static final hote hai

    PENDING(1 , "Order is placed and waiting for approval"),
    PROCESSING(2 , "Order is being packed"),
    SHIPPED(3,"Order is out for delivery"),
    DELIVERED(4,"Order successfully delivered");

    // Fields
    private final int statusCode;
    private final String description;

    private OrderStatus(int statusCode, String description)
    {
        this.statusCode=statusCode;
        this.description=description;
    }

    // Getters
    public int getStatusCode()
    {
        return statusCode;
    }

    public String getDescription()
    {
        return description;
    }


    //main method for use of Enums

   public static void main(String[] args)
   {
      OrderStatus  status=OrderStatus.DELIVERED;

       System.out.println("Status Code .."+status.getStatusCode());
       System.out.println("Description .."+status.getDescription());

       // Switch case के साथ उपयोग

       switch (status)
       {
           case PENDING:
               System.out.println("कृपया थोड़ा इंतज़ार करें।");
               break;
           case DELIVERED:
               System.out.println("आपका ऑर्डर पहुँच चुका है!");
               break;
           default:
               System.out.println("ऑर्डर रास्ते में है।");
       }
    }
}
