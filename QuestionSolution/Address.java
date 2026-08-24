package QuestionSolution;

//Immutable class
public final class Address
{
    private final String city;
    private final int pinCode;

    public Address(String city , int pinCode)
    {
        this.city=city;
        this.pinCode=pinCode;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }
}
