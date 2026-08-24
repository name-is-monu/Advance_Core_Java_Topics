package EnumInjava;

public enum PaymentMethod
{
    UPI("Unified Payments Interface" , 0.0),
    CREDIT_CARD("Credit Card Payment",2.5),
    DEBIT_CARD("Debit Card Payment" , 1.0),
    CASH_ON_DELIVERY("Cash on Delivery (COD)",10.0);

    // 2. Fields
    private final String displayName;
    private final double processingFeePercentage;

    //Parameterized Constructor ..
    private PaymentMethod(String displayName , double processingFeePercentage)
    {
        this.displayName=displayName;
        this.processingFeePercentage=processingFeePercentage;
    }

    //Getter Methods
    public String getDisplayName() {
        return displayName;
    }

    public double getProcessingFeePercentage() {
        return processingFeePercentage;
    }

    //Calculate Free of Plate form uses ..
    public double calculateTotalAmount(double orderAmount)
    {
       double fee=(orderAmount * processingFeePercentage)/100;
       return fee;
    }

    //Main Method for use Enum..

   public static void main(String[] args)
   {
          double billAmount=500;

          PaymentMethod pay=PaymentMethod.CREDIT_CARD;
       System.out.println("Paymeent Type :"+pay.getDisplayName());
       System.out.println("Original Bill :"+billAmount);

       //Enum

       double finalAmount=pay.calculateTotalAmount(billAmount);
       System.out.println("Total Amount to Pay (with fees): ₹" + (finalAmount+billAmount));

       //Switch uses

       System.out.println("\n--- Payment Instructions ---");
       switch (pay) {
           case UPI -> System.out.println("कृपया अपना GPay या PhonePe ऐप खोलें।");
           case CREDIT_CARD -> System.out.println("कृपया अपने क्रेडिट कार्ड की डिटेल्स भरें।");
           case CASH_ON_DELIVERY -> System.out.println("ऑर्डर डिलीवर होने पर कैश तैयार रखें।");
           default -> System.out.println("प्रोसेसिंग जारी है...");
       }
    }
}
